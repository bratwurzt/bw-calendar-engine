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
package org.bedework.calfacade.filter;

import org.bedework.caldav.util.filter.ObjectFilter;
import org.bedework.util.calendar.PropertyIndex.PropertyInfoIndex;

/** A filter that selects events that have a certain user href
 *
 * @author Mike Douglass
 * @version 1.0
 */
public class BwPrincipalHrefFilter extends ObjectFilter<String> {
  /** Match on a user.
   *
   * @param name - null one will be created
   * @param propertyIndex
   */
  public BwPrincipalHrefFilter(String name, PropertyInfoIndex propertyIndex) {
    super(name, propertyIndex);

    setCaseless(false);
  }
}
