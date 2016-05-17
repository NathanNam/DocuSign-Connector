
package org.mule.modules.docusign.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.docusign.DocusignConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>DocusignConnectorProcessAdapter</code> is a wrapper around {@link DocusignConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-05-17T08:54:16-07:00", comments = "Build UNNAMED.2762.e3b1307")
public class DocusignConnectorProcessAdapter
    extends DocusignConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<DocusignConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, DocusignConnectorCapabilitiesAdapter> getProcessTemplate() {
        final DocusignConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,DocusignConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, DocusignConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, DocusignConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
