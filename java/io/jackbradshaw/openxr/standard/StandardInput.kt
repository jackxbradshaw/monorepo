package io.jackbradshaw.openxr.standard

import io.jackbradshaw.openxr.standard.StandardUser.LEFT_HAND
import io.jackbradshaw.openxr.standard.StandardUser.RIGHT_HAND
import io.jackbradshaw.openxr.standard.StandardUser.GAMEPAD
import io.jackbradshaw.openxr.standard.StandardInteractionProfile.KHRONOS_SIMPLE_CONTROLLER
import io.jackbradshaw.openxr.standard.StandardInteractionProfile.HTC_VIVE_PRO
import io.jackbradshaw.openxr.standard.StandardInteractionProfile.HTC_VIVE_CONTROLLER
import io.jackbradshaw.openxr.standard.StandardInteractionProfile.MICROSOFT_XBOX_CONTROLLER
import io.jackbradshaw.openxr.standard.StandardInteractionProfile.MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER
import io.jackbradshaw.openxr.standard.StandardInteractionProfile.GOOGLE_DAYDREAM_CONTROLLER
import io.jackbradshaw.openxr.standard.StandardInteractionProfile.OCCULUS_TOUCH_CONTROLLER
import io.jackbradshaw.openxr.standard.StandardInteractionProfile.OCCULUS_GO_CONTROLLER
import io.jackbradshaw.openxr.standard.StandardInteractionProfile.VALVE_INDEX_CONTROLLER
import io.jackbradshaw.openxr.standard.StandardUser.HEAD
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.SELECT
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.MENU
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.SYSTEM
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.SQUEEZE
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.TRIGGER
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.VIEW
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.BACK
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.DPAD_DOWN
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.DPAD_UP
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.DPAD_LEFT
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.DPAD_RIGHT
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.A
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.B
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.SHOULDER
import io.jackbradshaw.openxr.standard.StandardInputLocation.LEFT
import io.jackbradshaw.openxr.standard.StandardInputLocation.RIGHT
import io.jackbradshaw.openxr.standard.StandardInputComponent.TOUCH
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.TRACKPAD
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.THUMBSTICK
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.THUMBREST
import io.jackbradshaw.openxr.standard.StandardOutputIdentifier.HAPTIC
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.GRIP
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.AIM
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.VOLUME_UP
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.VOLUME_DOWN
import io.jackbradshaw.openxr.standard.StandardInputIdentifier.MUTE_MIC
import io.jackbradshaw.openxr.standard.StandardInputComponent.CLICK
import io.jackbradshaw.openxr.standard.StandardInputComponent.POSE
import io.jackbradshaw.openxr.standard.StandardInputComponent.FORCE
import io.jackbradshaw.openxr.standard.StandardInputComponent.VALUE
import io.jackbradshaw.openxr.standard.StandardOutputLocation.LEFT_TRIGGER
import io.jackbradshaw.openxr.standard.StandardOutputLocation.RIGHT_TRIGGER
import io.jackbradshaw.openxr.model.input
import io.jackbradshaw.openxr.model.output
import io.jackbradshaw.openxr.model.Input
import io.jackbradshaw.openxr.model.Output

private fun input(
    interactionProfile: StandardInteractionProfile,
    user: StandardUser,
    identifier: StandardInputIdentifier,
    component: StandardInputComponent,
    location: StandardInputLocation? = null
) = input(interactionProfile.interactionProfile, user.user, identifier.identifier, component.component, location?.location)

enum class StandardInput(val input: Input) {
  KHRONOS_SIMPLE_LEFT_SELECT_CLICK(input(KHRONOS_SIMPLE_CONTROLLER, LEFT_HAND, SELECT, CLICK)),
  KHRONOS_SIMPLE_LEFT_MENU_CLICK(input(KHRONOS_SIMPLE_CONTROLLER, LEFT_HAND, MENU, CLICK)),
  KHRONOS_SIMPLE_LEFT_GRIP_POSE(input(KHRONOS_SIMPLE_CONTROLLER, LEFT_HAND, GRIP, POSE)),
  KHRONOS_SIMPLE_LEFT_AIM_POSE(input(KHRONOS_SIMPLE_CONTROLLER, LEFT_HAND, AIM, POSE)),
  KHRONOS_SIMPLE_RIGHT_SELECT_CLICK(input(KHRONOS_SIMPLE_CONTROLLER, RIGHT_HAND, SELECT, CLICK)),
  KHRONOS_SIMPLE_RIGHT_MENU_CLICK(input(KHRONOS_SIMPLE_CONTROLLER, RIGHT_HAND, MENU, CLICK)),
  KHRONOS_SIMPLE_GRIP_POSE_CLICK(input(KHRONOS_SIMPLE_CONTROLLER, RIGHT_HAND, GRIP, POSE)),
  KHRONOS_SIMPLE_AIM_POSE_CLICK(input(KHRONOS_SIMPLE_CONTROLLER, RIGHT_HAND, AIM, POSE)),
  GOOGLE_DAYDREAM_LEFT_SELECT_CLICK(input(GOOGLE_DAYDREAM_CONTROLLER, LEFT_HAND, SELECT, CLICK)),
  GOOGLE_DAYDREAM_LEFT_TRACKPAD_X(input(GOOGLE_DAYDREAM_CONTROLLER, LEFT_HAND, TRACKPAD, StandardInputComponent.X)),
  GOOGLE_DAYDREAM_LEFT_TRACKPAD_Y(input(GOOGLE_DAYDREAM_CONTROLLER, LEFT_HAND, TRACKPAD, StandardInputComponent.Y)),
  GOOGLE_DAYDREAM_LEFT_TRACKPAD_CLICK(input(GOOGLE_DAYDREAM_CONTROLLER, LEFT_HAND, TRACKPAD, CLICK)),
  GOOGLE_DAYDREAM_LEFT_TRACKPAD_TOUCH(input(GOOGLE_DAYDREAM_CONTROLLER, LEFT_HAND, TRACKPAD, TOUCH)),
  GOOGLE_DAYDREAM_LEFT_GRIP_POSE(input(GOOGLE_DAYDREAM_CONTROLLER, LEFT_HAND, GRIP, POSE)),
  GOOGLE_DAYDREAM_LEFT_AIM_POSE(input(GOOGLE_DAYDREAM_CONTROLLER, LEFT_HAND, AIM, POSE)),
  GOOGLE_DAYDREAM_RIGHT_SELECT_CLICK(input(GOOGLE_DAYDREAM_CONTROLLER, RIGHT_HAND, SELECT, CLICK)),
  GOOGLE_DAYDREAM_RIGHT_TRACKPAD_X(input(GOOGLE_DAYDREAM_CONTROLLER, RIGHT_HAND, TRACKPAD, StandardInputComponent.X)),
  GOOGLE_DAYDREAM_RIGHT_TRACKPAD_Y(input(GOOGLE_DAYDREAM_CONTROLLER, RIGHT_HAND, TRACKPAD, StandardInputComponent.Y)),
  GOOGLE_DAYDREAM_RIGHT_TRACKPAD_CLICK(input(GOOGLE_DAYDREAM_CONTROLLER, RIGHT_HAND, TRACKPAD, CLICK)),
  GOOGLE_DAYDREAM_RIGHT_TRACKPAD_TOUCH(input(GOOGLE_DAYDREAM_CONTROLLER, RIGHT_HAND, TRACKPAD, TOUCH)),
  GOOGLE_DAYDREAM_RIGHT_GRIP_POSE(input(GOOGLE_DAYDREAM_CONTROLLER, RIGHT_HAND, GRIP, POSE)),
  GOOGLE_DAYDREAM_RIGHT_AIM_POSE(input(GOOGLE_DAYDREAM_CONTROLLER, RIGHT_HAND, AIM, POSE)),
  HTC_VIVE_CONTROLLER_LEFT_SYSTEM_CLICK(input(HTC_VIVE_CONTROLLER, LEFT_HAND, SYSTEM, CLICK)),
  HTC_VIVE_CONTROLLER_LEFT_SQUEEZE_CLICK(input(HTC_VIVE_CONTROLLER, LEFT_HAND, SQUEEZE, CLICK)),
  HTC_VIVE_CONTROLLER_LEFT_MENU_CLICK(input(HTC_VIVE_CONTROLLER, LEFT_HAND, MENU, CLICK)),
  HTC_VIVE_CONTROLLER_LEFT_TRIGGER_CLICK(input(HTC_VIVE_CONTROLLER, LEFT_HAND, TRIGGER, CLICK)),
  HTC_VIVE_CONTROLLER_LEFT_TRIGGER_VALUE(input(HTC_VIVE_CONTROLLER, LEFT_HAND, TRIGGER, VALUE)),
  HTC_VIVE_CONTROLLER_LEFT_TRACKPAD_X(input(HTC_VIVE_CONTROLLER, LEFT_HAND, TRACKPAD, StandardInputComponent.X)),
  HTC_VIVE_CONTROLLER_LEFT_TRACKPAD_Y(input(HTC_VIVE_CONTROLLER, LEFT_HAND, TRACKPAD, StandardInputComponent.Y)),
  HTC_VIVE_CONTROLLER_LEFT_TRACKPAD_CLICK(input(HTC_VIVE_CONTROLLER, LEFT_HAND, TRACKPAD, CLICK)),
  HTC_VIVE_CONTROLLER_LEFT_TRACKPAD_TOUCH(input(HTC_VIVE_CONTROLLER, LEFT_HAND, TRACKPAD, TOUCH)),
  HTC_VIVE_CONTROLLER_LEFT_GRIP_POSE(input(HTC_VIVE_CONTROLLER, LEFT_HAND, GRIP, POSE)),
  HTC_VIVE_CONTROLLER_LEFT_AIM_POSE(input(HTC_VIVE_CONTROLLER, LEFT_HAND, AIM, POSE)),
  HTC_VIVE_CONTROLLER_RIGHT_SYSTEM_CLICK(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, SYSTEM, CLICK)),
  HTC_VIVE_CONTROLLER_RIGHT_SQUEEZE_CLICK(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, SQUEEZE, CLICK)),
  HTC_VIVE_CONTROLLER_RIGHT_MENU_CLICK(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, MENU, CLICK)),
  HTC_VIVE_CONTROLLER_RIGHT_TRIGGER_CLICK(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, TRIGGER, CLICK)),
  HTC_VIVE_CONTROLLER_RIGHT_TRIGGER_VALUE(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, TRIGGER, VALUE)),
  HTC_VIVE_CONTROLLER_RIGHT_TRACKPAD_X(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, TRACKPAD, StandardInputComponent.X)),
  HTC_VIVE_CONTROLLER_RIGHT_TRACKPAD_Y(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, TRACKPAD, StandardInputComponent.Y)),
  HTC_VIVE_CONTROLLER_RIGHT_TRACKPAD_CLICK(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, TRACKPAD, CLICK)),
  HTC_VIVE_CONTROLLER_RIGHT_TRACKPAD_TOUCH(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, TRACKPAD, TOUCH)),
  HTC_VIVE_CONTROLLER_RIGHT_GRIP_POSE(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, GRIP, POSE)),
  HTC_VIVE_CONTROLLER_RIGHT_AIM_POSE(input(HTC_VIVE_CONTROLLER, RIGHT_HAND, AIM, POSE)),
  HTC_VIVE_PRO_HEAD_SYSTEM_CLICK(input(HTC_VIVE_PRO, HEAD, SYSTEM, CLICK)),
  HTC_VIVE_PRO_HEAD_VOLUME_UP_CLICK(input(HTC_VIVE_PRO, HEAD, VOLUME_UP, CLICK)),
  HTC_VIVE_PRO_HEAD_VOLUME_DOWN_CLICK(input(HTC_VIVE_PRO, HEAD, VOLUME_DOWN, CLICK)),
  HTC_VIVE_PRO_HEAD_MUTE_MIC_CLICK(input(HTC_VIVE_PRO, HEAD, MUTE_MIC, CLICK)),
  MICROSOFT_MR_CONTROLLER_LEFT_MENU_CLICK(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, MENU, CLICK)),
  MICROSOFT_MR_CONTROLLER_LEFT_SQUEEZE_CLICK(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, SQUEEZE, CLICK)),
  MICROSOFT_MR_CONTROLLER_LEFT_TRIGGER_VALUE(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, TRIGGER, VALUE)),
  MICROSOFT_MR_CONTROLLER_LEFT_THUMBSTICK_X(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, THUMBSTICK, StandardInputComponent.X)),
  MICROSOFT_MR_CONTROLLER_LEFT_THUMBSTICK_Y(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, THUMBSTICK, StandardInputComponent.Y)),
  MICROSOFT_MR_CONTROLLER_LEFT_THUMBSTICK_CLICK(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, THUMBSTICK, CLICK)),
  MICROSOFT_MR_CONTROLLER_LEFT_TRACKPAD_X(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, TRACKPAD, StandardInputComponent.X)),
  MICROSOFT_MR_CONTROLLER_LEFT_TRACKPAD_Y(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, TRACKPAD, StandardInputComponent.Y)),
  MICROSOFT_MR_CONTROLLER_LEFT_TRACKPAD_CLICK(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, TRACKPAD, CLICK)),
  MICROSOFT_MR_CONTROLLER_LEFT_TRACKPAD_TOUCH(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, TRACKPAD, TOUCH)),
  MICROSOFT_MR_CONTROLLER_LEFT_GRIP_POSE(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, GRIP, POSE)),
  MICROSOFT_MR_CONTROLLER_LEFT_AIM_POSE(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, LEFT_HAND, AIM, POSE)),
  MICROSOFT_MR_CONTROLLER_RIGHT_MENU_CLICK(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, MENU, CLICK)),
  MICROSOFT_MR_CONTROLLER_RIGHT_SQUEEZE_CLICK(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, SQUEEZE, CLICK)),
  MICROSOFT_MR_CONTROLLER_RIGHT_TRIGGER_VALUE(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, TRIGGER, VALUE)),
  MICROSOFT_MR_CONTROLLER_RIGHT_THUMBSTICK_X(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, THUMBSTICK, StandardInputComponent.X)),
  MICROSOFT_MR_CONTROLLER_RIGHT_THUMBSTICK_Y(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, THUMBSTICK, StandardInputComponent.Y)),
  MICROSOFT_MR_CONTROLLER_RIGHT_THUMBSTICK_CLICK(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, THUMBSTICK, CLICK)),
  MICROSOFT_MR_CONTROLLER_RIGHT_TRACKPAD_X(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, TRACKPAD, StandardInputComponent.X)),
  MICROSOFT_MR_CONTROLLER_RIGHT_TRACKPAD_Y(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, TRACKPAD, StandardInputComponent.Y)),
  MICROSOFT_MR_CONTROLLER_RIGHT_TRACKPAD_CLICK(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, TRACKPAD, CLICK)),
  MICROSOFT_MR_CONTROLLER_RIGHT_TRACKPAD_TOUCH(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, TRACKPAD, TOUCH)),
  MICROSOFT_MR_CONTROLLER_RIGHT_GRIP_POSE(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, GRIP, POSE)),
  MICROSOFT_MR_CONTROLLER_RIGHT_AIM_POSE(input(MICROSOFT_MIXED_REALITY_MOTION_CONTROLLER, RIGHT_HAND, AIM, POSE)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_MENU_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, MENU, CLICK)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_VIEW_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, VIEW, CLICK)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_A_CLCK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, A, CLICK)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_B_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, B, CLICK)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_X_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, StandardInputIdentifier.X, CLICK)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_Y_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, StandardInputIdentifier.Y, CLICK)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_DPAD_UP_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, DPAD_UP, CLICK)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_DPAD_DOWN_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, DPAD_DOWN, CLICK)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_DPAD_LEFT_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, DPAD_LEFT, CLICK)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_DPAD_RIGHT_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, DPAD_RIGHT, CLICK)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_LEFT_SHOULDER_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, SHOULDER, CLICK, LEFT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_RIGHT_SHOULDER_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, SHOULDER, CLICK, RIGHT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_LEFT_THUMBSTICK_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, THUMBSTICK, CLICK, LEFT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_RIGHT_THUMBSTICK_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, THUMBSTICK, CLICK, RIGHT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_LEFT_THUMBSTICK_VALUE(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, THUMBSTICK, VALUE, LEFT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_RIGHT_THUMBSTICK_VALUE_RIGHT(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, THUMBSTICK, VALUE, RIGHT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_LEFT_THUMBSTCK_X(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, THUMBSTICK, StandardInputComponent.X, LEFT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_RIGHT_THUMBSTICK_X(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, THUMBSTICK, StandardInputComponent.X, RIGHT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_LEFT_THUMBSTICK_Y(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, THUMBSTICK, StandardInputComponent.Y, LEFT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_RIGHT_THUMBSTICK_Y(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, THUMBSTICK, StandardInputComponent.Y, RIGHT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_LEFT_TRIGGER_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, TRIGGER, CLICK, LEFT)),
  MICROSOFT_XBOX_CONTROLLER_GAMEPAD_RIGHT_TRIGGER_CLICK(input(MICROSOFT_XBOX_CONTROLLER, GAMEPAD, TRIGGER, CLICK, RIGHT)),
  OCCULUS_GO_LEFT_SYSTEM_CLICK(input(OCCULUS_GO_CONTROLLER, LEFT_HAND, SYSTEM, CLICK)),
  OCCULUS_GO_LEFT_TRIGGER_CLICK(input(OCCULUS_GO_CONTROLLER, LEFT_HAND, TRIGGER, CLICK)),
  OCCULUS_GO_LEFT_BACK_CLICK(input(OCCULUS_GO_CONTROLLER, LEFT_HAND, BACK, CLICK)),
  OCCULUS_GO_LEFT_TRACKPAD_X(input(OCCULUS_GO_CONTROLLER, LEFT_HAND, TRACKPAD, StandardInputComponent.X)),
  OCCULUS_GO_LEFT_TRACKPAD_Y(input(OCCULUS_GO_CONTROLLER, LEFT_HAND, TRACKPAD, StandardInputComponent.Y)),
  OCCULUS_GO_LEFT_TRACKPAD_CLICK(input(OCCULUS_GO_CONTROLLER, LEFT_HAND, TRACKPAD, CLICK)),
  OCCULUS_GO_LEFT_TRACKPAD_TOUCH(input(OCCULUS_GO_CONTROLLER, LEFT_HAND, TRACKPAD, TOUCH)),
  OCCULUS_GO_LEFT_GRIP_POSE(input(OCCULUS_GO_CONTROLLER, LEFT_HAND, GRIP, POSE)),
  OCCULUS_GO_LEFT_AIM_POSE(input(OCCULUS_GO_CONTROLLER, LEFT_HAND, AIM, POSE)),
  OCCULUS_GO_RIGHT_SYSTEM_CLICK(input(OCCULUS_GO_CONTROLLER, RIGHT_HAND, SYSTEM, CLICK)),
  OCCULUS_GO_RIGHT_TRIGGER_CLICK(input(OCCULUS_GO_CONTROLLER, RIGHT_HAND, TRIGGER, CLICK)),
  OCCULUS_GO_RIGHT_BACK_CLICK(input(OCCULUS_GO_CONTROLLER, RIGHT_HAND, BACK, CLICK)),
  OCCULUS_GO_RIGHT_TRACKPAD_X(input(OCCULUS_GO_CONTROLLER, RIGHT_HAND, TRACKPAD, StandardInputComponent.X)),
  OCCULUS_GO_RIGHT_TRACKPAD_Y(input(OCCULUS_GO_CONTROLLER, RIGHT_HAND, TRACKPAD, StandardInputComponent.Y)),
  OCCULUS_GO_RIGHT_TRACKPAD_CLICK(input(OCCULUS_GO_CONTROLLER, RIGHT_HAND, TRACKPAD, CLICK)),
  OCCULUS_GO_RIGHT_TRACKPAD_TOUCH(input(OCCULUS_GO_CONTROLLER, RIGHT_HAND, TRACKPAD, TOUCH)),
  OCCULUS_GO_RIGHT_GRIP_POSE(input(OCCULUS_GO_CONTROLLER, RIGHT_HAND, GRIP, POSE)),
  OCCULUS_GO_RIGHT_AIM_POSE(input(OCCULUS_GO_CONTROLLER, RIGHT_HAND, AIM, POSE)),
  OCCULUS_TOUCH_LEFT_X_CLICK(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, StandardInputIdentifier.X, CLICK)),
  OCCULUS_TOUCH_LEFT_X_TOUCH(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, StandardInputIdentifier.X, TOUCH)),
  OCCULUS_TOUCH_LEFT_Y_CLICK(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, StandardInputIdentifier.Y, CLICK)),
  OCCULUS_TOUCH_LEFT_Y_TRICK(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, StandardInputIdentifier.Y, TOUCH)),
  OCCULUS_TOUCH_LEFT_MENU_CLICK(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, MENU, CLICK)),
  OCCULUS_TOUCH_LEFT_SQUEEZE_VALUE(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, SQUEEZE, VALUE)),
  OCCULUS_TOUCH_LEFT_TRIGGER_VALUE(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, TRIGGER, VALUE)),
  OCCULUS_TOUCH_LEFT_TRIGGER_TOUCH(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, TRIGGER, TOUCH)),
  OCCULUS_TOUCH_LEFT_THUMBSTICK_X(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, THUMBSTICK, StandardInputComponent.X)),
  OCCULUS_TOUCH_LEFT_THUMBSTICK_Y(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, THUMBSTICK, StandardInputComponent.Y)),
  OCCULUS_TOUCH_LEFT_THUMBSTICK_CLICK(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, THUMBSTICK, CLICK)),
  OCCULUS_TOUCH_LEFT_THUMBSTICK_TOUCH(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, THUMBSTICK, TOUCH)),
  OCCULUS_TOUCH_LEFT_THUMBREST_TOUCH(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, THUMBREST, TOUCH)),
  OCCULUS_TOUCH_LEFT_GRIP_POSE(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, GRIP, POSE)),
  OCCULUS_TOUCH_LEFT_AIM_POSE(input(OCCULUS_TOUCH_CONTROLLER, LEFT_HAND, AIM, POSE)),
  OCCULUS_TOUCH_RIGHT_A_CLICK(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, A, CLICK)),
  OCCULUS_TOUCH_RIGHT_A_TOUCH(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, A, TOUCH)),
  OCCULUS_TOUCH_RIGHT_B_CLICK(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, B, CLICK)),
  OCCULUS_TOUCH_RIGHT_B_TOUCH(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, B, TOUCH)),
  OCCULUS_TOUCH_RIGHT_SYSTEM_CLICK(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, SYSTEM, CLICK)),
  OCCULUS_TOUCH_RIGHT_SQUEEZE_VALUE(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, SQUEEZE, VALUE)),
  OCCULUS_TOUCH_RIGHT_TRIGGER_VALUE(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, TRIGGER, VALUE)),
  OCCULUS_TOUCH_RIGHT_TRIGGER_TOUCH(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, TRIGGER, TOUCH)),
  OCCULUS_TOUCH_RIGHT_THUMBSTICK_X(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, THUMBSTICK, StandardInputComponent.X)),
  OCCULUS_TOUCH_RIGHT_THUMBSTICK_Y(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, THUMBSTICK, StandardInputComponent.Y)),
  OCCULUS_TOUCH_RIGHT_THUMBSTICK_CLICK(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, THUMBSTICK, CLICK)),
  OCCULUS_TOUCH_RIGHT_THUMBSTICK_TOUCH(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, THUMBSTICK, TOUCH)),
  OCCULUS_TOUCH_RIGHT_THUMBREST_TOUCH(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, THUMBREST, TOUCH)),
  OCCULUS_TOUCH_RIGHT_GRIP_POSE(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, GRIP, POSE)),
  OCCULUS_TOUCH_RIGHT_AIM_POSE(input(OCCULUS_TOUCH_CONTROLLER, RIGHT_HAND, AIM, POSE)),
  VALVE_INDEX_LEFT_SYSTEM_CLICK(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, SYSTEM, CLICK)),
  VALVE_INDEX_LEFT_SYSTEM_TOUCH(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, SYSTEM, TOUCH)),
  VALVE_INDEX_LEFT_A_CLICK(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, A, CLICK)),
  VALVE_INDEX_LEFT_A_TOUCH(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, A, TOUCH)),
  VALVE_INDEX_LEFT_B_CLICK(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, B, CLICK)),
  VALVE_INDEX_LEFT_B_TOUCH(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, B, TOUCH)),
  VALVE_INDEX_LEFT_SQUEEZE_VALUE(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, SQUEEZE, VALUE)),
  VALVE_INDEX_LEFT_SQUEEZE_FORCE(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, SQUEEZE, FORCE)),
  VALVE_INDEX_LEFT_TRIGGER_CLICK(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, TRIGGER, CLICK)),
  VALVE_INDEX_LEFT_TRIGGER_VALUE(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, TRIGGER, VALUE)),
  VALVE_INDEX_LEFT_TRIGGER_TOUCH(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, TRIGGER, TOUCH)),
  VALVE_INDEX_LEFT_THUMBSTICK_X(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, THUMBSTICK, StandardInputComponent.X)),
  VALVE_INDEX_LEFT_THUMBSTICK_Y(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, THUMBSTICK, StandardInputComponent.Y)),
  VALVE_INDEX_LEFT_THUMBSTICK_CLICK(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, THUMBSTICK, CLICK)),
  VALVE_INDEX_LEFT_THUMBSTICK_TOUCH(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, THUMBSTICK, TOUCH)),
  VALVE_INDEX_LEFT_TRACKPAD_X(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, TRACKPAD, StandardInputComponent.X)),
  VALVE_INDEX_LEFT_TRACKPAD_Y(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, TRACKPAD, StandardInputComponent.Y)),
  VALVE_INDEX_LEFT_TRACKPAD_FORCE(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, TRACKPAD, FORCE)),
  VALVE_INDEX_LEFT_TRACKPAD_TOUCH(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, TRACKPAD, TOUCH)),
  VALVE_INDEX_LEFT_GRIP_POSE(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, GRIP, POSE)),
  VALVE_INDEX_LEFT_AIM_POSE(input(VALVE_INDEX_CONTROLLER, LEFT_HAND, AIM, POSE)),
  VALVE_INDEX_RIGHT_SYSTEM_CLICK(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, SYSTEM, CLICK)),
  VALVE_INDEX_RIGHT_SYSTEM_TOUCH(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, SYSTEM, TOUCH)),
  VALVE_INDEX_RIGHT_A_CLICK(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, A, CLICK)),
  VALVE_INDEX_RIGHT_A_TOUCH(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, A, TOUCH)),
  VALVE_INDEX_RIGHT_B_CLICK(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, B, CLICK)),
  VALVE_INDEX_RIGHT_B_TOUCH(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, B, TOUCH)),
  VALVE_INDEX_RIGHT_SQUEEZE_VALUE(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, SQUEEZE, VALUE)),
  VALVE_INDEX_RIGHT_SQUEEZE_FORCE(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, SQUEEZE, FORCE)),
  VALVE_INDEX_RIGHT_TRIGGER_CLICK(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, TRIGGER, CLICK)),
  VALVE_INDEX_RIGHT_TRIGGER_VALUE(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, TRIGGER, VALUE)),
  VALVE_INDEX_RIGHT_TRIGGER_TOUCH(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, TRIGGER, TOUCH)),
  VALVE_INDEX_RIGHT_THUMBSTICK_X(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, THUMBSTICK, StandardInputComponent.X)),
  VALVE_INDEX_RIGHT_THUMBSTICK_Y(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, THUMBSTICK, StandardInputComponent.Y)),
  VALVE_INDEX_RIGHT_THUMBSTICK_CLICK(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, THUMBSTICK, CLICK)),
  VALVE_INDEX_RIGHT_THUMBSTICK_TOUCH(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, THUMBSTICK, TOUCH)),
  VALVE_INDEX_RIGHT_TRACKPAD_X(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, TRACKPAD, StandardInputComponent.X)),
  VALVE_INDEX_RIGHT_TRACKPAD_Y(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, TRACKPAD, StandardInputComponent.Y)),
  VALVE_INDEX_RIGHT_TRACKPAD_FORCE(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, TRACKPAD, FORCE)),
  VALVE_INDEX_RIGHT_TRACKPAD_TOUCH(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, TRACKPAD, TOUCH)),
  VALVE_INDEX_RIGHT_GRIP_POSE(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, GRIP, POSE)),
  VALVE_INDEX_RIGHT_AIM_POSE(input(VALVE_INDEX_CONTROLLER, RIGHT_HAND, AIM, POSE)),
}