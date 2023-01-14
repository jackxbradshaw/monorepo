package io.jackbradshaw.otter.engine.integration

import com.jme3.scene.Spatial
import io.jackbradshaw.otter.engine.Engine

class SpatialIntegrator(private val engine: Engine) : EngineIntegrator<Spatial> {

  override suspend fun integrate(element: Spatial) {
    engine.extractGameNode().attachChild(element)
  }

  override suspend fun disintegrate(element: Spatial) {
    engine.extractGameNode().detachChild(element)
  }
}