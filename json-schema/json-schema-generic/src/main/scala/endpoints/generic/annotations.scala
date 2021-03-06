package endpoints.generic

/**
  * Documents a case class field.
  *
  * Annotate a case class field with this annotation to define its
  * documentation.
  *
  * @param text Description of the annotated field
  */
case class docs(text: String) extends scala.annotation.Annotation

/**
  * Defines the name of a generic schema.
  *
  * Annotate a sealed trait or case class definition with this annotation
  * to define its schema name.
  *
  * @param value Name of the schema
  */
case class name(value: String) extends scala.annotation.Annotation

/**
  * Defines the name of the discriminator field of a generic tagged schema.
  *
  * Annotate a sealed trait definition with this annotation to define
  * the name of its discriminator field.
  *
  * @param name Name of the tagged discriminator field
  */
case class discriminator(name: String) extends scala.annotation.Annotation
