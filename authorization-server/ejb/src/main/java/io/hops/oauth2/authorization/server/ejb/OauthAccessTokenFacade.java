/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.oauth2.authorization.server.ejb;

import io.hops.oauth2.authorization.server.entities.OauthAccessToken;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ermias
 */
@Stateless
public class OauthAccessTokenFacade extends AbstractFacade<OauthAccessToken> {

  @PersistenceContext(unitName = "oauth2_PU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public OauthAccessTokenFacade() {
    super(OauthAccessToken.class);
  }

}
