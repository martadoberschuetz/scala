package models

case class Customer(id: Long, label: String)

object Customer{

	def all(): List[Customer] = Nil

	// def create(label: String)
  // def delete(id: Long)
	
	def withdraw(id: Long)

}