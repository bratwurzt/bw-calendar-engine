/* ********************************************************************
    Licensed to Jasig under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Jasig licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License. You may obtain a
    copy of the License at:

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on
    an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied. See the License for the
    specific language governing permissions and limitations
    under the License.
*/
package org.bedework.calsvc.notifications;

import java.util.List;

/**
 * User: mike Date: 8/16/15 Time: 11:31
 */
public class SubscribeMessage {
  private final String system;
  private final String token;
  private final String userToken;
  private final String href;
  private final List<String> emailAddresses;

  public SubscribeMessage(final String system,
                          final String token,
                          final String userToken,
                          final String href,
                          final List<String> emailAddresses) {
    this.system = system;
    this.token = token;
    this.userToken = userToken;
    this.href = href;
    this.emailAddresses = emailAddresses;
  }

  public String getSystem() {
    return system;
  }

  public String getToken() {
    return token;
  }

  public String getUserToken() {
    return userToken;
  }

  public String getHref() {
    return href;
  }

  public List<String> getEmailAddresses() {
    return emailAddresses;
  }
}
