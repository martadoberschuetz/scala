package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Customer

object Application extends Controller {

  def index = Action {
    Redirect(routes.Application.customers)
    //Ok("Hello")
  }

  def customers = Action {

    Ok("Hello")
    //??

  }

  def withdraw(id: Long) = TODO

  //for later:
  //def deposit(id: Long) = TODO

  val customerForm = Form(
    "label" -> nonEmptyText
  )

}