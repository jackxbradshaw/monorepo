package io.jackbradshaw.otter.openxr.model

fun input(
    user: User,
    identifier: InputIdentifier,
    component: InputComponent,
    location: InputLocation? = null) = Input.newBuilder().apply {
  setUser(user)
  setIdentifier(identifier)
  setComponent(component)
  if (location != null) setLocation(location)
}.build()

//fun InputSpec.path() = "input/" + identifier.standardName + (location?.standardName?.let { "_$it" } ?: "") + "/" + component.standardName