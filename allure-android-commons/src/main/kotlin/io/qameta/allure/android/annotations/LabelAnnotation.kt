package io.qameta.allure.android.annotations

import java.lang.annotation.Inherited

/**
 * Meta-annotation for defining custom annotations for Allure labels, useful if you want to define
 * your own set of Annotations for Allure labels.
 *
 * Any annotation having a [LabelAnnotation] must have a method called `value` returning any Object.
 * The key is denoted by the [LabelAnnotation].
 *
 * Example definition of such an annotation:
 *
 * ```
 * enum class TestLayer { UNIT, INSTRUMENTED }
 *
 * @Inherited
 * @Retention(AnnotationRetention.RUNTIME)
 * @Target(AnnotationTarget.FUNCTION, AnnotationTarget.CLASS)
 * @LabelAnnotation("layer")
 * annotation class Layer(val value: TestLayer)
 * ```
 */
@Inherited
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class LabelAnnotation(val value: String)