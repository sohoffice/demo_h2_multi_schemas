package models;

import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "A")
@Table(name = "A", schema = "foo")
public class A extends Model {

  @Id
  @Column(name = "ID")
  public String id;

  @Column(name = "NAME")
  public String name;

  public static Finder<String,A> finder = new Finder<>(String.class, A.class);

}
