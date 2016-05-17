package org.mule.modules.docusign;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.modules.docusign.config.ConnectorConfig;

@Connector(name="docusign", friendlyName="Docusign", minMuleVersion = "3.7")
public class DocusignConnector {

    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}