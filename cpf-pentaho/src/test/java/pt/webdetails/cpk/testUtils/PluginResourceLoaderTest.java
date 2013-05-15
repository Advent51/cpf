/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/. */


package pt.webdetails.cpk.testUtils;

import java.io.File;
import org.pentaho.platform.plugin.services.pluginmgr.PluginClassLoader;
import org.pentaho.platform.plugin.services.pluginmgr.PluginResourceLoader;

/**
 *
 * @author joao
 */
public class PluginResourceLoaderTest extends PluginResourceLoader {

    @Override
    protected PluginClassLoader getOverrideClassloader() {

        
        File path = new File(System.getProperty("user.dir")+"/test-resources/repo/cpkSol");
        
        return new PluginClassLoader(path, null);
                
    }

}