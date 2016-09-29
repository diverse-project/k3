package fr.inria.diverse.k3.al.annotationprocessor

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Set Unique = true on an EReference
 */
@Target(ElementType::FIELD)
@Retention(RetentionPolicy.SOURCE)
annotation Unique {}
