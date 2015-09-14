package fr.inria.diverse.k3.al.annotationprocessor

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Just for marking references as containment.
 * Cannot use @Composition as we don't want
 * any processor to be invoked.
 */
@Target(ElementType::FIELD, ElementType::METHOD)
@Retention(RetentionPolicy.SOURCE)
annotation Containment {}
