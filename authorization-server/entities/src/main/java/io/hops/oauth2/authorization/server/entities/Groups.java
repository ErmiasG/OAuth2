/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.oauth2.authorization.server.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ermias
 */
@Entity
@Table(name = "Groups",
    catalog = "oauth",
    schema = "")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Groups.findAll",
      query = "SELECT g FROM Groups g"),
  @NamedQuery(name = "Groups.findById",
      query = "SELECT g FROM Groups g WHERE g.id = :id"),
  @NamedQuery(name = "Groups.findByName",
      query = "SELECT g FROM Groups g WHERE g.name = :name"),
  @NamedQuery(name = "Groups.findByDescription",
      query = "SELECT g FROM Groups g WHERE g.description = :description")})
public class Groups implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Basic(optional = false)
  @Column(name = "name")
  private String name;
  @Column(name = "description")
  private String description;

  public Groups() {
  }

  public Groups(Integer id) {
    this.id = id;
  }

  public Groups(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Groups)) {
      return false;
    }
    Groups other = (Groups) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "io.hops.oauth2.authorization.server.entities.Groups[ id=" + id + " ]";
  }
  
}