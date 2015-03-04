package models

import com.avaje.ebean.Ebean
import org.scalatestplus.play.{OneAppPerSuite, PlaySpec}
import org.scalatest._
import Matchers._
import play.api.test.FakeApplication

/**
 * Created by douglas on 2015/3/4.
 */
class ModelsSpec extends PlaySpec with OneAppPerSuite {

  implicit override lazy val app = FakeApplication()

  "A" should {
    "created in schema foo and count foo.A should == 1" in {
      val a = new A()
      a.id = "1"
      a.name = "model 1"
      Ebean.save(a)

      val a2 = A.finder.where().eq("id", "1").findUnique()
      a2.name should === ("model 1")

      val q = Ebean.createSqlQuery("SELECT count(*) cnt FROM foo.A")
      val countRow = q.findUnique()
      countRow.get("cnt") should === (1)
    }
  }

  "B" should {
    "created in schema bar and count bar.B should == 1" in {
      val b = new B()
      b.id = "b1"
      b.name = "model b1"
      Ebean.save(b)

      val aB = B.finder.where().eq("id", "b1").findUnique()
      aB.name should === ("model b1")

      val q = Ebean.createSqlQuery("SELECT count(*) cnt FROM bar.B")
      val countRow = q.findUnique()
      countRow.get("cnt") should === (1)
    }
  }
}
