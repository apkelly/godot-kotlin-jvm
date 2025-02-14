// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Particle properties for [godot.GPUParticles3D] and [godot.GPUParticles2D] nodes.
 *
 * ParticleProcessMaterial defines particle properties and behavior. It is used in the `process_material` of [godot.GPUParticles3D] and [godot.GPUParticles2D] emitter nodes.
 *
 * Some of this material's properties are applied to each particle when emitted, while others can have a [godot.CurveTexture] applied to vary values over the lifetime of the particle.
 *
 * Particle animation is available only in [godot.GPUParticles2D]. To use it, attach a [godot.CanvasItemMaterial], with [godot.CanvasItemMaterial.particlesAnimation] enabled, to the particles node.
 */
@GodotBaseType
public open class ParticleProcessMaterial : Material() {
  /**
   * Particle lifetime randomness ratio. The equation for the lifetime of a particle is `lifetime * (1.0 - randf() * lifetime_randomness)`. For example, a [lifetimeRandomness] of `0.4` scales the lifetime between `0.6` to `1.0` of its original value.
   */
  public var lifetimeRandomness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLifetimeRandomnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLifetimeRandomnessPtr, NIL)
    }

  /**
   * Particles will be emitted inside this region. Use [enum EmissionShape] constants for values.
   */
  public var emissionShape: EmissionShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionShapePtr, LONG)
      return ParticleProcessMaterial.EmissionShape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionShapePtr, NIL)
    }

  /**
   * The sphere's radius if `emission_shape` is set to [EMISSION_SHAPE_SPHERE].
   */
  public var emissionSphereRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionSphereRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionSphereRadiusPtr, NIL)
    }

  /**
   * The box's extents if `emission_shape` is set to [EMISSION_SHAPE_BOX].
   */
  @CoreTypeLocalCopy
  public var emissionBoxExtents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionBoxExtentsPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionBoxExtentsPtr, NIL)
    }

  /**
   * Particles will be emitted at positions determined by sampling this texture at a random position. Used with [EMISSION_SHAPE_POINTS] and [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the "Particles" tool in the toolbar.
   */
  public var emissionPointTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPointTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPointTexturePtr, NIL)
    }

  /**
   * Particle velocity and rotation will be set by sampling this texture at the same point as the [emissionPointTexture]. Used only in [EMISSION_SHAPE_DIRECTED_POINTS]. Can be created automatically from mesh or node by selecting "Create Emission Points from Mesh/Node" under the "Particles" tool in the toolbar.
   */
  public var emissionNormalTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionNormalTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionNormalTexturePtr, NIL)
    }

  /**
   * Particle color will be modulated by color determined by sampling this texture at the same point as the [emissionPointTexture].
   *
   * **Note:** [emissionColorTexture] multiplies the particle mesh's vertex colors. To have a visible effect on a [godot.BaseMaterial3D], [godot.BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function. Otherwise, [emissionColorTexture] will have no visible effect.
   */
  public var emissionColorTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionColorTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionColorTexturePtr, NIL)
    }

  /**
   * The number of emission points if `emission_shape` is set to [EMISSION_SHAPE_POINTS] or [EMISSION_SHAPE_DIRECTED_POINTS].
   */
  public var emissionPointCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionPointCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionPointCountPtr, NIL)
    }

  /**
   * The axis of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  @CoreTypeLocalCopy
  public var emissionRingAxis: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingAxisPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingAxisPtr, NIL)
    }

  /**
   * The height of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingHeightPtr, NIL)
    }

  /**
   * The radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingRadiusPtr, NIL)
    }

  /**
   * The inner radius of the ring when using the emitter [EMISSION_SHAPE_RING].
   */
  public var emissionRingInnerRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionRingInnerRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionRingInnerRadiusPtr, NIL)
    }

  /**
   * Align Y axis of particle with the direction of its velocity.
   */
  public var particleFlagAlignY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
    }

  /**
   * If `true`, particles rotate around Y axis by [angleMin].
   */
  public var particleFlagRotateY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
    }

  /**
   * If `true`, particles will not move on the z axis.
   */
  public var particleFlagDisableZ: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParticleFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParticleFlagPtr, NIL)
    }

  /**
   * Unit vector specifying the particles' emission direction.
   */
  @CoreTypeLocalCopy
  public var direction: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDirectionPtr, NIL)
    }

  /**
   * Each particle's initial direction range from `+spread` to `-spread` degrees.
   */
  public var spread: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpreadPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpreadPtr, NIL)
    }

  /**
   * Amount of [spread] along the Y axis.
   */
  public var flatness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFlatnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFlatnessPtr, NIL)
    }

  /**
   * Gravity applied to every particle.
   */
  @CoreTypeLocalCopy
  public var gravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
    }

  /**
   * Minimum equivalent of [initialVelocityMax].
   */
  public var initialVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum initial velocity magnitude for each particle. Direction comes from [direction] and [spread].
   */
  public var initialVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Minimum equivalent of [angularVelocityMax].
   */
  public var angularVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum initial angular velocity (rotation speed) applied to each particle in *degrees* per second.
   *
   * Only applied when [particleFlagDisableZ] or [particleFlagRotateY] are `true` or the [godot.BaseMaterial3D] being used to draw the particle is using [godot.BaseMaterial3D.BILLBOARD_PARTICLES].
   */
  public var angularVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's angular velocity (rotation speed) will vary along this [godot.CurveTexture] over its lifetime.
   */
  public var angularVelocityCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Minimum equivalent of [orbitVelocityMax].
   */
  public var orbitVelocityMin: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum orbital velocity applied to each particle. Makes the particles circle around origin. Specified in number of full rotations around origin per second.
   *
   * Only available when [particleFlagDisableZ] is `true`.
   */
  public var orbitVelocityMax: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's orbital velocity will vary along this [godot.CurveTexture].
   */
  public var orbitVelocityCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Minimum equivalent of [linearAccelMax].
   */
  public var linearAccelMin: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum linear acceleration applied to each particle in the direction of motion.
   */
  public var linearAccelMax: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's linear acceleration will vary along this [godot.CurveTexture].
   */
  public var linearAccelCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Minimum equivalent of [radialAccelMax].
   */
  public var radialAccelMin: Float
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum radial acceleration applied to each particle. Makes particle accelerate away from the origin or towards it if negative.
   */
  public var radialAccelMax: Float
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's radial acceleration will vary along this [godot.CurveTexture].
   */
  public var radialAccelCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Minimum equivalent of [tangentialAccelMax].
   */
  public var tangentialAccelMin: Float
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum tangential acceleration applied to each particle. Tangential acceleration is perpendicular to the particle's velocity giving the particles a swirling motion.
   */
  public var tangentialAccelMax: Float
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's tangential acceleration will vary along this [godot.CurveTexture].
   */
  public var tangentialAccelCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Minimum equivalent of [dampingMax].
   */
  public var dampingMin: Float
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * The maximum rate at which particles lose velocity. For example value of `100` means that the particle will go from `100` velocity to `0` in `1` second.
   */
  public var dampingMax: Float
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Damping will vary along this [godot.CurveTexture].
   */
  public var dampingCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Minimum equivalent of [angleMax].
   */
  public var angleMin: Float
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum initial rotation applied to each particle, in degrees.
   *
   * Only applied when [particleFlagDisableZ] or [particleFlagRotateY] are `true` or the [godot.BaseMaterial3D] being used to draw the particle is using [godot.BaseMaterial3D.BILLBOARD_PARTICLES].
   */
  public var angleMax: Float
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's rotation will be animated along this [godot.CurveTexture].
   */
  public var angleCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Minimum equivalent of [scaleMax].
   */
  public var scaleMin: Float
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum initial scale applied to each particle.
   */
  public var scaleMax: Float
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's scale will vary along this [godot.CurveTexture]. If a [godot.CurveXYZTexture] is supplied instead, the scale will be separated per-axis.
   */
  public var scaleCurve: Material?
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Each particle's initial color. If the [godot.GPUParticles2D]'s `texture` is defined, it will be multiplied by this color.
   *
   * **Note:** [color] multiplies the particle mesh's vertex colors. To have a visible effect on a [godot.BaseMaterial3D], [godot.BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function. Otherwise, [color] will have no visible effect.
   */
  @CoreTypeLocalCopy
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
    }

  /**
   * Each particle's color will vary along this [godot.GradientTexture1D] over its lifetime (multiplied with [color]).
   *
   * **Note:** [colorRamp] multiplies the particle mesh's vertex colors. To have a visible effect on a [godot.BaseMaterial3D], [godot.BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function. Otherwise, [colorRamp] will have no visible effect.
   */
  public var colorRamp: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorRampPtr, NIL)
    }

  /**
   * Each particle's initial color will vary along this [godot.GradientTexture1D] (multiplied with [color]).
   *
   * **Note:** [colorInitialRamp] multiplies the particle mesh's vertex colors. To have a visible effect on a [godot.BaseMaterial3D], [godot.BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function. Otherwise, [colorInitialRamp] will have no visible effect.
   */
  public var colorInitialRamp: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorInitialRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorInitialRampPtr, NIL)
    }

  /**
   * Minimum equivalent of [hueVariationMax].
   */
  public var hueVariationMin: Float
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum initial hue variation applied to each particle. It will shift the particle color's hue.
   */
  public var hueVariationMax: Float
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's hue will vary along this [godot.CurveTexture].
   */
  public var hueVariationCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * If `true`, enables turbulence for the particle system. Turbulence can be used to vary particle movement according to its position (based on a 3D noise pattern). In 3D, [godot.GPUParticlesAttractorVectorField3D] with [godot.NoiseTexture3D] can be used as an alternative to turbulence that works in world space and with multiple particle systems reacting in the same way.
   *
   * **Note:** Enabling turbulence has a high performance cost on the GPU. Only enable turbulence on a few particle systems at once at most, and consider disabling it when targeting mobile/web platforms.
   */
  public var turbulenceEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceEnabledPtr, NIL)
    }

  /**
   * The turbulence noise strength. Increasing this will result in a stronger, more contrasting, flow pattern.
   */
  public var turbulenceNoiseStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseStrengthPtr, NIL)
    }

  /**
   * This value controls the overall scale/frequency of the turbulence noise pattern.
   *
   * A small scale will result in smaller features with more detail while a high scale will result in smoother noise with larger features.
   */
  public var turbulenceNoiseScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseScalePtr, NIL)
    }

  /**
   * A scrolling velocity for the turbulence field. This sets a directional trend for the pattern to move in over time.
   *
   * The default value of `Vector3(0, 0, 0)` turns off the scrolling.
   */
  @CoreTypeLocalCopy
  public var turbulenceNoiseSpeed: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseSpeedPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseSpeedPtr, NIL)
    }

  /**
   * The in-place rate of change of the turbulence field. This defines how quickly the noise pattern varies over time.
   *
   * A value of 0.0 will result in a fixed pattern.
   */
  public var turbulenceNoiseSpeedRandom: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbulenceNoiseSpeedRandomPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbulenceNoiseSpeedRandomPtr, NIL)
    }

  /**
   * Minimum turbulence influence on each particle.
   *
   * The actual amount of turbulence influence on each particle is calculated as a random value between [turbulenceInfluenceMin] and [turbulenceInfluenceMax] and multiplied by the amount of turbulence influence from [turbulenceInfluenceOverLife].
   */
  public var turbulenceInfluenceMin: Float
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum turbulence influence on each particle.
   *
   * The actual amount of turbulence influence on each particle is calculated as a random value between [turbulenceInfluenceMin] and [turbulenceInfluenceMax] and multiplied by the amount of turbulence influence from [turbulenceInfluenceOverLife].
   */
  public var turbulenceInfluenceMax: Float
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Minimum displacement of each particle's spawn position by the turbulence.
   *
   * The actual amount of displacement will be a factor of the underlying turbulence multiplied by a random value between [turbulenceInitialDisplacementMin] and [turbulenceInitialDisplacementMax].
   */
  public var turbulenceInitialDisplacementMin: Float
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum displacement of each particle's spawn position by the turbulence.
   *
   * The actual amount of displacement will be a factor of the underlying turbulence multiplied by a random value between [turbulenceInitialDisplacementMin] and [turbulenceInitialDisplacementMax].
   */
  public var turbulenceInitialDisplacementMax: Float
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's amount of turbulence will be influenced along this [godot.CurveTexture] over its life time.
   */
  public var turbulenceInfluenceOverLife: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Minimum equivalent of [animSpeedMax].
   */
  public var animSpeedMin: Float
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum particle animation speed. Animation speed of `1` means that the particles will make full `0` to `1` offset cycle during lifetime, `2` means `2` cycles etc.
   *
   * With animation speed greater than `1`, remember to enable [godot.CanvasItemMaterial.particlesAnimLoop] property if you want the animation to repeat.
   */
  public var animSpeedMax: Float
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's animation speed will vary along this [godot.CurveTexture].
   */
  public var animSpeedCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   * Minimum equivalent of [animOffsetMax].
   */
  public var animOffsetMin: Float
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMinPtr, NIL)
    }

  /**
   * Maximum animation offset that corresponds to frame index in the texture. `0` is the first frame, `1` is the last one. See [godot.CanvasItemMaterial.particlesAnimation].
   */
  public var animOffsetMax: Float
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setParamMaxPtr, NIL)
    }

  /**
   * Each particle's animation offset will vary along this [godot.CurveTexture].
   */
  public var animOffsetCurve: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getParamTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParamTexturePtr, NIL)
    }

  /**
   *
   */
  public var subEmitterMode: SubEmitterMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterModePtr, LONG)
      return ParticleProcessMaterial.SubEmitterMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterModePtr, NIL)
    }

  /**
   *
   */
  public var subEmitterFrequency: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterFrequencyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterFrequencyPtr, NIL)
    }

  /**
   *
   */
  public var subEmitterAmountAtEnd: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterAmountAtEndPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterAmountAtEndPtr, NIL)
    }

  /**
   * Sub particle amount on collision.
   *
   * Maximum amount set in the sub particles emitter.
   */
  public var subEmitterAmountAtCollision: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterAmountAtCollisionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterAmountAtCollisionPtr, NIL)
    }

  /**
   *
   */
  public var subEmitterKeepVelocity: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubEmitterKeepVelocityPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubEmitterKeepVelocityPtr, NIL)
    }

  /**
   * True if the interaction with particle attractors is enabled.
   */
  public var attractorInteractionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAttractorInteractionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAttractorInteractionEnabledPtr, NIL)
    }

  /**
   * The particles' collision mode.
   *
   * **Note:** 3D Particles can only collide with [godot.GPUParticlesCollision3D] nodes, not [godot.PhysicsBody3D] nodes. To make particles collide with various objects, you can add [godot.GPUParticlesCollision3D] nodes as children of [godot.PhysicsBody3D] nodes.
   *
   * **Note:** 2D Particles can only collide with [godot.LightOccluder2D] nodes, not [godot.PhysicsBody2D] nodes.
   */
  public var collisionMode: CollisionMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionModePtr, LONG)
      return ParticleProcessMaterial.CollisionMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionModePtr, NIL)
    }

  /**
   * The particles' friction. Values range from `0` (frictionless) to `1` (maximum friction). Only effective if [collisionMode] is [COLLISION_RIGID].
   */
  public var collisionFriction: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionFrictionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionFrictionPtr, NIL)
    }

  /**
   * The particles' bounciness. Values range from `0` (no bounce) to `1` (full bounciness). Only effective if [collisionMode] is [COLLISION_RIGID].
   */
  public var collisionBounce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionBouncePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionBouncePtr, NIL)
    }

  /**
   * Should collision take scale into account.
   */
  public var collisionUseScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollisionUsingScalePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionUseScalePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PARTICLEPROCESSMATERIAL, scriptIndex)
    return true
  }

  /**
   * The box's extents if `emission_shape` is set to [EMISSION_SHAPE_BOX].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.emissionBoxExtents
   * //Your changes
   * particleprocessmaterial.emissionBoxExtents = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun emissionBoxExtentsMutate(block: Vector3.() -> Unit): Vector3 =
      emissionBoxExtents.apply{
      block(this)
      emissionBoxExtents = this
  }


  /**
   * The axis of the ring when using the emitter [EMISSION_SHAPE_RING].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.emissionRingAxis
   * //Your changes
   * particleprocessmaterial.emissionRingAxis = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun emissionRingAxisMutate(block: Vector3.() -> Unit): Vector3 =
      emissionRingAxis.apply{
      block(this)
      emissionRingAxis = this
  }


  /**
   * Unit vector specifying the particles' emission direction.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.direction
   * //Your changes
   * particleprocessmaterial.direction = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun directionMutate(block: Vector3.() -> Unit): Vector3 = direction.apply{
      block(this)
      direction = this
  }


  /**
   * Gravity applied to every particle.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.gravity
   * //Your changes
   * particleprocessmaterial.gravity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityMutate(block: Vector3.() -> Unit): Vector3 = gravity.apply{
      block(this)
      gravity = this
  }


  /**
   * Each particle's initial color. If the [godot.GPUParticles2D]'s `texture` is defined, it will be multiplied by this color.
   *
   * **Note:** [color] multiplies the particle mesh's vertex colors. To have a visible effect on a [godot.BaseMaterial3D], [godot.BaseMaterial3D.vertexColorUseAsAlbedo] *must* be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function. Otherwise, [color] will have no visible effect.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.color
   * //Your changes
   * particleprocessmaterial.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  /**
   * A scrolling velocity for the turbulence field. This sets a directional trend for the pattern to move in over time.
   *
   * The default value of `Vector3(0, 0, 0)` turns off the scrolling.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = particleprocessmaterial.turbulenceNoiseSpeed
   * //Your changes
   * particleprocessmaterial.turbulenceNoiseSpeed = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun turbulenceNoiseSpeedMutate(block: Vector3.() -> Unit): Vector3 =
      turbulenceNoiseSpeed.apply{
      block(this)
      turbulenceNoiseSpeed = this
  }


  public enum class Parameter(
    id: Long,
  ) {
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set initial velocity properties.
     */
    PARAM_INITIAL_LINEAR_VELOCITY(0),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set angular velocity properties.
     */
    PARAM_ANGULAR_VELOCITY(1),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set orbital velocity properties.
     */
    PARAM_ORBIT_VELOCITY(2),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set linear acceleration properties.
     */
    PARAM_LINEAR_ACCEL(3),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set radial acceleration properties.
     */
    PARAM_RADIAL_ACCEL(4),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set tangential acceleration properties.
     */
    PARAM_TANGENTIAL_ACCEL(5),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set damping properties.
     */
    PARAM_DAMPING(6),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set angle properties.
     */
    PARAM_ANGLE(7),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set scale properties.
     */
    PARAM_SCALE(8),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set hue variation properties.
     */
    PARAM_HUE_VARIATION(9),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set animation speed properties.
     */
    PARAM_ANIM_SPEED(10),
    /**
     * Use with [setParamMin], [setParamMax], and [setParamTexture] to set animation offset properties.
     */
    PARAM_ANIM_OFFSET(11),
    /**
     * Represents the size of the [enum Parameter] enum.
     */
    PARAM_MAX(15),
    /**
     * Use with [setParamMin] and [setParamMax] to set the turbulence minimum und maximum influence on each particles velocity.
     */
    PARAM_TURB_VEL_INFLUENCE(13),
    /**
     * Use with [setParamMin] and [setParamMax] to set the turbulence minimum and maximum displacement of the particles spawn position.
     */
    PARAM_TURB_INIT_DISPLACEMENT(14),
    /**
     * Use with [setParamTexture] to set the turbulence influence over the particles life time.
     */
    PARAM_TURB_INFLUENCE_OVER_LIFE(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ParticleFlags(
    id: Long,
  ) {
    /**
     * Use with [setParticleFlag] to set [particleFlagAlignY].
     */
    PARTICLE_FLAG_ALIGN_Y_TO_VELOCITY(0),
    /**
     * Use with [setParticleFlag] to set [particleFlagRotateY].
     */
    PARTICLE_FLAG_ROTATE_Y(1),
    /**
     * Use with [setParticleFlag] to set [particleFlagDisableZ].
     */
    PARTICLE_FLAG_DISABLE_Z(2),
    /**
     * Represents the size of the [enum ParticleFlags] enum.
     */
    PARTICLE_FLAG_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EmissionShape(
    id: Long,
  ) {
    /**
     * All particles will be emitted from a single point.
     */
    EMISSION_SHAPE_POINT(0),
    /**
     * Particles will be emitted in the volume of a sphere.
     */
    EMISSION_SHAPE_SPHERE(1),
    /**
     * Particles will be emitted on the surface of a sphere.
     */
    EMISSION_SHAPE_SPHERE_SURFACE(2),
    /**
     * Particles will be emitted in the volume of a box.
     */
    EMISSION_SHAPE_BOX(3),
    /**
     * Particles will be emitted at a position determined by sampling a random point on the [emissionPointTexture]. Particle color will be modulated by [emissionColorTexture].
     */
    EMISSION_SHAPE_POINTS(4),
    /**
     * Particles will be emitted at a position determined by sampling a random point on the [emissionPointTexture]. Particle velocity and rotation will be set based on [emissionNormalTexture]. Particle color will be modulated by [emissionColorTexture].
     */
    EMISSION_SHAPE_DIRECTED_POINTS(5),
    /**
     * Particles will be emitted in a ring or cylinder.
     */
    EMISSION_SHAPE_RING(6),
    /**
     * Represents the size of the [enum EmissionShape] enum.
     */
    EMISSION_SHAPE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SubEmitterMode(
    id: Long,
  ) {
    /**
     *
     */
    SUB_EMITTER_DISABLED(0),
    /**
     *
     */
    SUB_EMITTER_CONSTANT(1),
    /**
     *
     */
    SUB_EMITTER_AT_END(2),
    /**
     *
     */
    SUB_EMITTER_AT_COLLISION(3),
    /**
     * Represents the size of the [enum SubEmitterMode] enum.
     */
    SUB_EMITTER_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CollisionMode(
    id: Long,
  ) {
    /**
     * No collision for particles. Particles will go through [godot.GPUParticlesCollision3D] nodes.
     */
    COLLISION_DISABLED(0),
    /**
     * [godot.RigidBody3D]-style collision for particles using [godot.GPUParticlesCollision3D] nodes.
     */
    COLLISION_RIGID(1),
    /**
     * Hide particles instantly when colliding with a [godot.GPUParticlesCollision3D] node. This can be combined with a subemitter that uses the [COLLISION_RIGID] collision mode to "replace" the parent particle with the subemitter on impact.
     */
    COLLISION_HIDE_ON_CONTACT(2),
    /**
     * Represents the size of the [enum CollisionMode] enum.
     */
    COLLISION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_direction")

    public val getDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_direction")

    public val setSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_spread")

    public val getSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_spread")

    public val setFlatnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_flatness")

    public val getFlatnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_flatness")

    public val setParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_min")

    public val getParamMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_min")

    public val setParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_max")

    public val getParamMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_max")

    public val setParamTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_param_texture")

    public val getParamTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_param_texture")

    public val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color")

    public val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color")

    public val setColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color_ramp")

    public val getColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color_ramp")

    public val setColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_color_initial_ramp")

    public val getColorInitialRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_color_initial_ramp")

    public val setParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_particle_flag")

    public val getParticleFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_particle_flag")

    public val setEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_shape")

    public val getEmissionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_shape")

    public val setEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_sphere_radius")

    public val getEmissionSphereRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_sphere_radius")

    public val setEmissionBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_box_extents")

    public val getEmissionBoxExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_box_extents")

    public val setEmissionPointTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_point_texture")

    public val getEmissionPointTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_point_texture")

    public val setEmissionNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_normal_texture")

    public val getEmissionNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_normal_texture")

    public val setEmissionColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_color_texture")

    public val getEmissionColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_color_texture")

    public val setEmissionPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_point_count")

    public val getEmissionPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_point_count")

    public val setEmissionRingAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_axis")

    public val getEmissionRingAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_axis")

    public val setEmissionRingHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_height")

    public val getEmissionRingHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_height")

    public val setEmissionRingRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_radius")

    public val getEmissionRingRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_radius")

    public val setEmissionRingInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_emission_ring_inner_radius")

    public val getEmissionRingInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_emission_ring_inner_radius")

    public val getTurbulenceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_enabled")

    public val setTurbulenceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_enabled")

    public val getTurbulenceNoiseStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_strength")

    public val setTurbulenceNoiseStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_strength")

    public val getTurbulenceNoiseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_scale")

    public val setTurbulenceNoiseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_scale")

    public val getTurbulenceNoiseSpeedRandomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_speed_random")

    public val setTurbulenceNoiseSpeedRandomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_speed_random")

    public val getTurbulenceNoiseSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_turbulence_noise_speed")

    public val setTurbulenceNoiseSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_turbulence_noise_speed")

    public val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_gravity")

    public val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_gravity")

    public val setLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_lifetime_randomness")

    public val getLifetimeRandomnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_lifetime_randomness")

    public val getSubEmitterModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_mode")

    public val setSubEmitterModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_mode")

    public val getSubEmitterFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_frequency")

    public val setSubEmitterFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_frequency")

    public val getSubEmitterAmountAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_amount_at_end")

    public val setSubEmitterAmountAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_amount_at_end")

    public val getSubEmitterAmountAtCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_amount_at_collision")

    public val setSubEmitterAmountAtCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_amount_at_collision")

    public val getSubEmitterKeepVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_sub_emitter_keep_velocity")

    public val setSubEmitterKeepVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_sub_emitter_keep_velocity")

    public val setAttractorInteractionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_attractor_interaction_enabled")

    public val isAttractorInteractionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "is_attractor_interaction_enabled")

    public val setCollisionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_mode")

    public val getCollisionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_mode")

    public val setCollisionUseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_use_scale")

    public val isCollisionUsingScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "is_collision_using_scale")

    public val setCollisionFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_friction")

    public val getCollisionFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_friction")

    public val setCollisionBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "set_collision_bounce")

    public val getCollisionBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParticleProcessMaterial", "get_collision_bounce")
  }
}
