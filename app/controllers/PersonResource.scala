package controllers

import models.{Address, Person}
import org.h2.result.SortOrder

object PersonResource {
  def getPersonById(id:Long):models.Person = {
    if(Application.mockMode) {
      dummyPerson
    }
    null
  }

  def getPersonList(name: String, limit: Long, offset: Long, sort: SortOrder, sortColumn: String): List[Person] = {
    if(Application.mockMode) {
      dummyPersonList
    }
    null
  }

  def createPerson(person: Person):Person = {
    dummyPerson
  }

  val dummyPersonList: List[Person] = List(
    new Person(123, "Dummy 1", new Address("1 Main St", "1", "GNV", "FL", "USA", 32601), 1234),
    new Person(234, "Dummy 2", new Address("2 Main St", "2", "GNV", "FL", "USA", 32602), 2345),
    new Person(345, "Dummy 3", new Address("3 Main St", "3", "GNV", "FL", "USA", 32603), 3456),
    new Person(456, "Dummy 4", new Address("4 Main St", "4", "GNV", "FL", "USA", 32604), 4567)
  )

  val dummyPerson: Person = new Person(123,
                                      "Dummy Person",
                                      new Address("123 Main Street",
                                                  "214",
                                                  "Gainesville",
                                                  "FL",
                                                  "USA",
                                                  32601),
                                      123456789)
}
