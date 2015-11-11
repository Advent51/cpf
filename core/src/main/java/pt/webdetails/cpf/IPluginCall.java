/*!
* Copyright 2002 - 2013 Webdetails, a Pentaho company.  All rights reserved.
* 
* This software was developed by Webdetails and is provided under the terms
* of the Mozilla Public License, Version 2.0, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to  http://mozilla.org/MPL/2.0/. The Initial Developer is Webdetails.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

package pt.webdetails.cpf;

import pt.webdetails.cpf.plugin.CorePlugin;

import java.util.Map;

/**
 * @deprecated gonna break this one too
 */
public interface IPluginCall {

  public static final String DEFAULT_ENCODING = "UTF-8";

  public void init( CorePlugin plugin, String method, Map<String, Object> params );

  public String getMethod();

  public void setMethod( String method );

  public String call();

}
