package io.prediction.controller

/** Base trait for all kinds of parameters that will be passed to constructors
  * of different controller classes.
  *
  * @group General
  */
trait Params extends Serializable {}

/** A concrete implementation of [[Params]] representing empty parameters.
  *
  * @group General
  */
case class EmptyParams() extends Params {
  override def toString(): String = "Empty"
}