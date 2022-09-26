package io.jackbradshaw.clearxr.standard

import io.jackbradshaw.clearxr.standard.StandardUser.LEFT_HAND
import io.jackbradshaw.clearxr.standard.StandardUser.RIGHT_HAND
import io.jackbradshaw.clearxr.standard.StandardUser.GAMEPAD
import io.jackbradshaw.clearxr.standard.StandardUser.HEAD
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.SELECT
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.MENU
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.SYSTEM
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.SQUEEZE
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.TRIGGER
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.VIEW
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.BACK
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.DPAD_DOWN
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.DPAD_UP
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.DPAD_LEFT
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.DPAD_RIGHT
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.A
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.B
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.SHOULDER
import io.jackbradshaw.clearxr.standard.StandardInputLocation.LEFT
import io.jackbradshaw.clearxr.standard.StandardInputLocation.RIGHT
import io.jackbradshaw.clearxr.standard.StandardInputComponent.TOUCH
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.TRACKPAD
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.THUMBSTICK
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.THUMBREST
import io.jackbradshaw.clearxr.standard.StandardOutputIdentifier.HAPTIC
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.GRIP
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.AIM
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.VOLUME_UP
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.VOLUME_DOWN
import io.jackbradshaw.clearxr.standard.StandardInputIdentifier.MUTE_MIC
import io.jackbradshaw.clearxr.standard.StandardInputComponent.CLICK
import io.jackbradshaw.clearxr.standard.StandardInputComponent.POSE
import io.jackbradshaw.clearxr.standard.StandardInputComponent.FORCE
import io.jackbradshaw.clearxr.standard.StandardInputComponent.VALUE
import io.jackbradshaw.clearxr.standard.StandardOutputLocation.LEFT_TRIGGER
import io.jackbradshaw.clearxr.standard.StandardOutputLocation.RIGHT_TRIGGER
import io.jackbradshaw.clearxr.model.interactionProfile
import io.jackbradshaw.clearxr.model.InteractionProfile

/*
 * The standard interaction profiles defined by
 * [version 1.0 of the OpenXR standard](https://registry.khronos.org/OpenXR/specs/1.0/pdf/xrspec.pdf).
 */
enum class StandardInteractionProfile(val profile: InteractionProfile) {
  KHRONOS_SIMPLE_CONTROLLER(interactionProfile(
      vendorId = "khr",
      controllerId = "simple_controller",
      inputs = setOf(
          input(LEFT_HAND, SELECT, CLICK),
          input(LEFT_HAND, MENU, CLICK),
          input(LEFT_HAND, GRIP, POSE),
          input(LEFT_HAND, AIM, POSE),
          input(RIGHT_HAND, SELECT, CLICK),
          input(RIGHT_HAND, MENU, CLICK),
          input(RIGHT_HAND, GRIP, POSE),
          input(RIGHT_HAND, AIM, POSE),
      ),
      outputs = setOf(
          output(LEFT_HAND, HAPTIC),
          output(RIGHT_HAND, HAPTIC)
      ))),
  GOOGLE_DAYDREAM_CONTROLLER(interactionProfile(vendorId = "google", controllerId = "daydream_controller", inputs = setOf(
      input(LEFT_HAND, SELECT, CLICK),
      input(LEFT_HAND, TRACKPAD, StandardInputComponent.X),
      input(LEFT_HAND, TRACKPAD, StandardInputComponent.Y),
      input(LEFT_HAND, TRACKPAD, CLICK),
      input(LEFT_HAND, TRACKPAD, TOUCH),
      input(LEFT_HAND, GRIP, POSE),
      input(LEFT_HAND, AIM, POSE),
      input(RIGHT_HAND, SELECT, CLICK),
      input(RIGHT_HAND, TRACKPAD, StandardInputComponent.X),
      input(RIGHT_HAND, TRACKPAD, StandardInputComponent.Y),
      input(RIGHT_HAND, TRACKPAD, CLICK),
      input(RIGHT_HAND, TRACKPAD, TOUCH),
      input(RIGHT_HAND, GRIP, POSE),
      input(RIGHT_HAND, AIM, POSE),
  ), outputs = setOf())),
  HTC_VIVE_CONTROLLER(interactionProfile(vendorId = "htc", controllerId = "vive_controller", inputs = setOf(
      input(LEFT_HAND, SYSTEM, CLICK),
      input(LEFT_HAND, SQUEEZE, CLICK),
      input(LEFT_HAND, MENU, CLICK),
      input(LEFT_HAND, TRIGGER, CLICK),
      input(LEFT_HAND, TRIGGER, VALUE),
      input(LEFT_HAND, TRACKPAD, StandardInputComponent.X),
      input(LEFT_HAND, TRACKPAD, StandardInputComponent.Y),
      input(LEFT_HAND, TRACKPAD, CLICK),
      input(LEFT_HAND, TRACKPAD, TOUCH),
      input(LEFT_HAND, GRIP, POSE),
      input(LEFT_HAND, AIM, POSE),
      input(RIGHT_HAND, SYSTEM, CLICK),
      input(RIGHT_HAND, SQUEEZE, CLICK),
      input(RIGHT_HAND, MENU, CLICK),
      input(RIGHT_HAND, TRIGGER, CLICK),
      input(RIGHT_HAND, TRIGGER, VALUE),
      input(RIGHT_HAND, TRACKPAD, StandardInputComponent.X),
      input(RIGHT_HAND, TRACKPAD, StandardInputComponent.Y),
      input(RIGHT_HAND, TRACKPAD, CLICK),
      input(RIGHT_HAND, TRACKPAD, TOUCH),
      input(RIGHT_HAND, GRIP, POSE),
      input(RIGHT_HAND, AIM, POSE),
  ), outputs = setOf(
      output(LEFT_HAND, HAPTIC), output(RIGHT_HAND, HAPTIC)
  ))),
  HTC_VIVE_PRO(interactionProfile(vendorId = "htc", controllerId = "vive_pro", inputs = setOf(
      input(HEAD, SYSTEM, CLICK),
      input(HEAD, VOLUME_UP, CLICK),
      input(HEAD, VOLUME_DOWN, CLICK),
      input(HEAD, MUTE_MIC, CLICK),
  ), outputs = setOf())),
  MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER(interactionProfile(
      vendorId = "microsoft",
      controllerId = "motion_controller",
      inputs = setOf(
          input(LEFT_HAND, MENU, CLICK),
          input(LEFT_HAND, SQUEEZE, CLICK),
          input(LEFT_HAND, TRIGGER, VALUE),
          input(LEFT_HAND, THUMBSTICK, StandardInputComponent.X),
          input(LEFT_HAND, THUMBSTICK, StandardInputComponent.Y),
          input(LEFT_HAND, THUMBSTICK, CLICK),
          input(LEFT_HAND, TRACKPAD, StandardInputComponent.X),
          input(LEFT_HAND, TRACKPAD, StandardInputComponent.Y),
          input(LEFT_HAND, TRACKPAD, CLICK),
          input(LEFT_HAND, TRACKPAD, TOUCH),
          input(LEFT_HAND, GRIP, POSE),
          input(LEFT_HAND, AIM, POSE),
          input(RIGHT_HAND, MENU, CLICK),
          input(RIGHT_HAND, SQUEEZE, CLICK),
          input(RIGHT_HAND, TRIGGER, VALUE),
          input(RIGHT_HAND, THUMBSTICK, StandardInputComponent.X),
          input(RIGHT_HAND, THUMBSTICK, StandardInputComponent.Y),
          input(RIGHT_HAND, THUMBSTICK, CLICK),
          input(RIGHT_HAND, TRACKPAD, StandardInputComponent.X),
          input(RIGHT_HAND, TRACKPAD, StandardInputComponent.Y),
          input(RIGHT_HAND, TRACKPAD, CLICK),
          input(RIGHT_HAND, TRACKPAD, TOUCH),
          input(RIGHT_HAND, GRIP, POSE),
          input(RIGHT_HAND, AIM, POSE),
      ), outputs = setOf(
      output(LEFT_HAND, HAPTIC), output(RIGHT_HAND, HAPTIC)
  ))),
  MICROSOFT_XBOX_CONTROLLER(interactionProfile(vendorId = "microsoft", controllerId = "xbox_controller", inputs = setOf(
      input(GAMEPAD, MENU, CLICK),
      input(GAMEPAD, VIEW, CLICK),
      input(GAMEPAD, A, CLICK),
      input(GAMEPAD, B, CLICK),
      input(GAMEPAD, StandardInputIdentifier.Y, CLICK),
      input(GAMEPAD, StandardInputIdentifier.X, CLICK),
      input(GAMEPAD, DPAD_UP, CLICK),
      input(GAMEPAD, DPAD_DOWN, CLICK),
      input(GAMEPAD, DPAD_LEFT, CLICK),
      input(GAMEPAD, DPAD_RIGHT, CLICK),
      input(GAMEPAD, SHOULDER, CLICK, LEFT),
      input(GAMEPAD, SHOULDER, CLICK, RIGHT),
      input(GAMEPAD, THUMBSTICK, CLICK, LEFT),
      input(GAMEPAD, THUMBSTICK, CLICK, RIGHT),
      input(GAMEPAD, THUMBSTICK, VALUE, LEFT),
      input(GAMEPAD, THUMBSTICK, VALUE, RIGHT),
      input(GAMEPAD, THUMBSTICK, StandardInputComponent.X, LEFT),
      input(GAMEPAD, THUMBSTICK, StandardInputComponent.X, RIGHT),
      input(GAMEPAD, THUMBSTICK, StandardInputComponent.Y, LEFT),
      input(GAMEPAD, THUMBSTICK, StandardInputComponent.Y, RIGHT),
      input(GAMEPAD, TRIGGER, CLICK, LEFT),
      input(GAMEPAD, TRIGGER, CLICK, RIGHT),
  ), outputs = setOf(
      output(GAMEPAD, HAPTIC, StandardOutputLocation.LEFT),
      output(GAMEPAD, HAPTIC, StandardOutputLocation.RIGHT),
      output(GAMEPAD, HAPTIC, LEFT_TRIGGER),
      output(GAMEPAD, HAPTIC, RIGHT_TRIGGER),
  ))),
  OCCULUS_GO_CONTROLLER(interactionProfile(vendorId = "oculus", controllerId = "go_controller", inputs = setOf(
      input(LEFT_HAND, SYSTEM, CLICK),
      input(LEFT_HAND, TRIGGER, CLICK),
      input(LEFT_HAND, BACK, CLICK),
      input(LEFT_HAND, TRACKPAD, StandardInputComponent.X),
      input(LEFT_HAND, TRACKPAD, StandardInputComponent.Y),
      input(LEFT_HAND, TRACKPAD, CLICK),
      input(LEFT_HAND, TRACKPAD, TOUCH),
      input(LEFT_HAND, GRIP, POSE),
      input(LEFT_HAND, AIM, POSE),
      input(RIGHT_HAND, SYSTEM, CLICK),
      input(RIGHT_HAND, TRIGGER, CLICK),
      input(RIGHT_HAND, BACK, CLICK),
      input(RIGHT_HAND, TRACKPAD, StandardInputComponent.X),
      input(RIGHT_HAND, TRACKPAD, StandardInputComponent.Y),
      input(RIGHT_HAND, TRACKPAD, CLICK),
      input(RIGHT_HAND, TRACKPAD, TOUCH),
      input(RIGHT_HAND, GRIP, POSE),
      input(RIGHT_HAND, AIM, POSE),
  ), outputs = setOf())),
  OCCULUS_TOUCH_CONTROLLER(interactionProfile(vendorId = "oculus", controllerId = "touch_controller", inputs = setOf(
      input(LEFT_HAND, StandardInputIdentifier.X, CLICK),
      input(LEFT_HAND, StandardInputIdentifier.X, TOUCH),
      input(LEFT_HAND, StandardInputIdentifier.Y, CLICK),
      input(LEFT_HAND, StandardInputIdentifier.Y, TOUCH),
      input(LEFT_HAND, MENU, CLICK),
      input(LEFT_HAND, SQUEEZE, VALUE),
      input(LEFT_HAND, TRIGGER, VALUE),
      input(LEFT_HAND, TRIGGER, TOUCH),
      input(LEFT_HAND, THUMBSTICK, StandardInputComponent.X),
      input(LEFT_HAND, THUMBSTICK, StandardInputComponent.Y),
      input(LEFT_HAND, THUMBSTICK, CLICK),
      input(LEFT_HAND, THUMBSTICK, TOUCH),
      input(LEFT_HAND, THUMBREST, TOUCH),
      input(LEFT_HAND, GRIP, POSE),
      input(LEFT_HAND, AIM, POSE),
      input(RIGHT_HAND, A, CLICK),
      input(RIGHT_HAND, A, TOUCH),
      input(RIGHT_HAND, B, CLICK),
      input(RIGHT_HAND, B, TOUCH),
      input(RIGHT_HAND, SYSTEM, CLICK),
      input(RIGHT_HAND, SQUEEZE, VALUE),
      input(RIGHT_HAND, TRIGGER, VALUE),
      input(RIGHT_HAND, TRIGGER, TOUCH),
      input(RIGHT_HAND, THUMBSTICK, StandardInputComponent.X),
      input(RIGHT_HAND, THUMBSTICK, StandardInputComponent.Y),
      input(RIGHT_HAND, THUMBSTICK, CLICK),
      input(RIGHT_HAND, THUMBSTICK, TOUCH),
      input(RIGHT_HAND, THUMBREST, TOUCH),
      input(RIGHT_HAND, GRIP, POSE),
      input(RIGHT_HAND, AIM, POSE),
  ), outputs = setOf(
      output(LEFT_HAND, HAPTIC), output(RIGHT_HAND, HAPTIC)
  ))),
  VALVE_INDEX_CONTROLLER(interactionProfile(vendorId = "valve", controllerId = "index_controller", inputs = setOf(
      input(LEFT_HAND, SYSTEM, CLICK),
      input(LEFT_HAND, SYSTEM, TOUCH),
      input(LEFT_HAND, A, CLICK),
      input(LEFT_HAND, A, TOUCH),
      input(LEFT_HAND, B, CLICK),
      input(LEFT_HAND, B, TOUCH),
      input(LEFT_HAND, SQUEEZE, VALUE),
      input(LEFT_HAND, SQUEEZE, FORCE),
      input(LEFT_HAND, TRIGGER, CLICK),
      input(LEFT_HAND, TRIGGER, VALUE),
      input(LEFT_HAND, TRIGGER, TOUCH),
      input(LEFT_HAND, THUMBSTICK, StandardInputComponent.X),
      input(LEFT_HAND, THUMBSTICK, StandardInputComponent.Y),
      input(LEFT_HAND, THUMBSTICK, CLICK),
      input(LEFT_HAND, THUMBSTICK, TOUCH),
      input(LEFT_HAND, TRACKPAD, StandardInputComponent.X),
      input(LEFT_HAND, TRACKPAD, StandardInputComponent.Y),
      input(LEFT_HAND, TRACKPAD, FORCE),
      input(LEFT_HAND, TRACKPAD, TOUCH),
      input(LEFT_HAND, GRIP, POSE),
      input(LEFT_HAND, AIM, POSE),
      input(RIGHT_HAND, SYSTEM, CLICK),
      input(RIGHT_HAND, SYSTEM, TOUCH),
      input(RIGHT_HAND, A, CLICK),
      input(RIGHT_HAND, A, TOUCH),
      input(RIGHT_HAND, B, CLICK),
      input(RIGHT_HAND, B, TOUCH),
      input(RIGHT_HAND, SQUEEZE, VALUE),
      input(RIGHT_HAND, SQUEEZE, FORCE),
      input(RIGHT_HAND, TRIGGER, CLICK),
      input(RIGHT_HAND, TRIGGER, VALUE),
      input(RIGHT_HAND, TRIGGER, TOUCH),
      input(RIGHT_HAND, THUMBSTICK, StandardInputComponent.X),
      input(RIGHT_HAND, THUMBSTICK, StandardInputComponent.Y),
      input(RIGHT_HAND, THUMBSTICK, CLICK),
      input(RIGHT_HAND, THUMBSTICK, TOUCH),
      input(RIGHT_HAND, TRACKPAD, StandardInputComponent.X),
      input(RIGHT_HAND, TRACKPAD, StandardInputComponent.Y),
      input(RIGHT_HAND, TRACKPAD, FORCE),
      input(RIGHT_HAND, TRACKPAD, TOUCH),
      input(RIGHT_HAND, GRIP, POSE),
      input(RIGHT_HAND, AIM, POSE),
  ), outputs = setOf(
      output(LEFT_HAND, HAPTIC), output(RIGHT_HAND, HAPTIC)
  )));

  companion object {
    private val reverse = StandardInteractionProfile.values().map { it.profile to it }.toMap()
    fun fromInteractionProfile(profile: InteractionProfile): StandardInteractionProfile? {
      return reverse[profile]
    }
  }
}