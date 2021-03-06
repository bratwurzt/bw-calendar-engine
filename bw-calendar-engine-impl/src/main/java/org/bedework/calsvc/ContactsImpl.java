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
package org.bedework.calsvc;

import org.bedework.calfacade.BwContact;
import org.bedework.calfacade.BwString;
import org.bedework.calfacade.exc.CalFacadeException;
import org.bedework.calsvci.Contacts;
import org.bedework.util.calendar.PropertyIndex.PropertyInfoIndex;

import java.util.Collection;

/** Class which handles manipulation of Contacts.
 *
 * @author Mike Douglass   douglm - rpi.edu
 */
public class ContactsImpl
        extends EventPropertiesImpl<BwContact>
        implements Contacts {
  /** Constructor
  *
  * @param svci calsvc object
  */
  public ContactsImpl(final CalSvc svci) {
    super(svci);
  }

  @SuppressWarnings("unchecked")
  @Override
  public void init(final boolean adminCanEditAllPublic) {
    super.init(BwContact.class.getCanonicalName(),
               adminCanEditAllPublic);
  }

  @Override
  Collection<BwContact> fetchAllIndexed(final boolean publick,
                                        final String ownerHref)
          throws CalFacadeException {
    return getIndexer(publick, ownerHref).fetchAllContacts();
  }

  @Override
  BwContact fetchIndexedByUid(final String uid) throws CalFacadeException {
    return getIndexer().fetchContact(uid, PropertyInfoIndex.UID);
  }

  @Override
  BwContact findPersistent(final BwContact val,
                           final String ownerHref) throws CalFacadeException {
    return findPersistent(val.getFinderKeyValue(), ownerHref);
  }

  @Override
  public boolean exists(final BwContact val) throws CalFacadeException {
    return findPersistent(val.getFinderKeyValue(), val.getOwnerHref()) != null;
  }

  @Override
  public BwContact find(final BwString val) throws CalFacadeException {
    return getIndexer().fetchContact(val.getValue(),
                                     PropertyInfoIndex.CN,
                                     PropertyInfoIndex.VALUE);
  }
}

