package de.codecentric.gatling

import io.gatling.core.check.Check

/**
  * Created by ronny on 15.05.17.
  */
package object jdbc {

  type JdbcCheck = Check[List[Map[String, Any]]]

}
