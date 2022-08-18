package io.jackbradshaw.jockstrap.clock

import io.jackbradshaw.jockstrap.JockstrapScope
import io.jackbradshaw.jockstrap.engine.Engine
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@JockstrapScope
class RenderingClock @Inject internal constructor(
  private val engine: Engine
) : Clock {

  init {
    engine.extractCoroutineScope().launch(Dispatchers.Default) {
      while (true) {
        val previousTotalTime = totalFlow.value
        totalFlow.value = engine.extractTotalTime()
        deltaFlow.value = totalFlow.value - previousTotalTime
      }
    }
  }

  private val totalFlow = MutableStateFlow<Double>(0.0)
  private val deltaFlow = MutableStateFlow<Double>(0.0)

  override fun totalSec() = totalFlow
  override fun deltaSec() = deltaFlow
}