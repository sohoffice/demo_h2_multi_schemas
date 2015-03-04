package models;

import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "B")
@Table(name = "B", schema = "bar")
public class B extends Model {
  @Id
  @Column(name = "ID")
  public String id;

  @Column(name = "NAME")
  public String name;

  public static Finder<String,B> finder = new Finder<>(String.class, B.class);
}
