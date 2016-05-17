package org.mule.modules.docusign.config;

import java.util.ArrayList;
import java.util.List;

import org.mule.api.annotations.components.WsdlProvider;
import org.mule.api.annotations.ws.WsdlServiceEndpoint;
import org.mule.api.annotations.ws.WsdlServiceRetriever;
import org.mule.devkit.api.ws.definition.DefaultServiceDefinition;
import org.mule.devkit.api.ws.definition.ServiceDefinition;

@WsdlProvider(friendlyName = "Configuration")
public class ConnectorConfig {

    @WsdlServiceRetriever
    public List<ServiceDefinition> getServiceDefinitions() {

        final List<ServiceDefinition> serviceDefinitions = new ArrayList<ServiceDefinition>();

        serviceDefinitions.add(new DefaultServiceDefinition(
                "APIService_APIServiceSoap",
                "dsapi",
                "https://www.docusign.net/api/3.0/schema/dsapi.wsdl",
                "APIService",
                "APIServiceSoap"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "AccountManagementService_AccountManagementServiceSoap",
                "dsapi-accountmanagement",
                "https://www.docusign.net/api/3.0/schema/dsapi-accountmanagement.wsdl",
                "AccountManagementService",
                "AccountManagementServiceSoap"));
        return serviceDefinitions;
    }

    @WsdlServiceEndpoint
    public String getServiceEndpoint(ServiceDefinition definition) {
        String result;
        final String id = definition.getId();
        switch(id){
                case "APIService_APIServiceSoap": {
                result = "http://www.docusign.net/api/3.0/dsapi.asmx";
                break;
            }
                case "AccountManagementService_AccountManagementServiceSoap": {
                result = "https://www.docusign.net/api/3.0/AccountManagement.asmx";
                break;
            }
                default: {
                throw new IllegalArgumentException(id + " endpoint could not be resolved.");
            }
        }
        return result;
    }


}