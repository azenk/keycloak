package org.keycloak.models.cache.entities;

import org.keycloak.models.RealmModel;
import org.keycloak.models.RoleModel;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class CachedClientRole extends CachedRole {
    private final String idClient;

    public CachedClientRole(String idClient, RoleModel model, RealmModel realm) {
        super(model, realm);
        this.idClient = idClient;

    }

    public String getIdClient() {
        return idClient;
    }
}
