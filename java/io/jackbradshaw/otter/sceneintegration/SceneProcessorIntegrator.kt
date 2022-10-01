package io.jackbradshaw.otter.engine.sceneintegration

import com.jme3.post.SceneProcessor
import io.jackbradshaw.otter.engine.Engine

class SceneProcessorIntegrator(private val engine: Engine) : SceneIntegrator<SceneProcessor> {

  override suspend fun integrate(element: SceneProcessor) {
    engine.extractDefaultViewPort().addProcessor(element)
  }

  override suspend fun disintegrate(element: SceneProcessor) {
    engine.extractDefaultViewPort().removeProcessor(element)
  }
}
