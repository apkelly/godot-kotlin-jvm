// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.TypeManager
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
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
 * A color interpolator resource which can be used to generate colors between user-defined color points.
 *
 * Given a set of colors, this resource will interpolate them in order. This means that if you have color 1, color 2 and color 3, the gradient will interpolate from color 1 to color 2 and from color 2 to color 3. The gradient will initially have 2 colors (black and white), one (black) at gradient lower offset 0 and the other (white) at the gradient higher offset 1.
 *
 * See also [godot.Curve] which supports more complex easing methods, but does not support colors.
 */
@GodotBaseType
public open class Gradient : Resource() {
  /**
   * The algorithm used to interpolate between points of the gradient. See [enum InterpolationMode] for available modes.
   */
  public var interpolationMode: InterpolationMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInterpolationModePtr, LONG)
      return Gradient.InterpolationMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setInterpolationModePtr, NIL)
    }

  /**
   * The color space used to interpolate between points of the gradient. It does not affect the returned colors, which will always be in sRGB space. See [enum ColorSpace] for available modes.
   *
   * **Note:** This setting has no effect when [interpolationMode] is set to [GRADIENT_INTERPOLATE_CONSTANT].
   */
  public var interpolationColorSpace: ColorSpace
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInterpolationColorSpacePtr, LONG)
      return Gradient.ColorSpace.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setInterpolationColorSpacePtr, NIL)
    }

  /**
   * Gradient's offsets returned as a [godot.PackedFloat32Array].
   *
   * **Note:** This property returns a copy, modifying the return value does not update the gradient. To update the gradient use [setOffset] method (for updating offsets individually) or assign to this property directly (for bulk-updating all offsets at once).
   */
  public var offsets: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetsPtr, PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetsPtr, NIL)
    }

  /**
   * Gradient's colors returned as a [godot.PackedColorArray].
   *
   * **Note:** This property returns a copy, modifying the return value does not update the gradient. To update the gradient use [setColor] method (for updating colors individually) or assign to this property directly (for bulk-updating all colors at once).
   */
  public var colors: PackedColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorsPtr, PACKED_COLOR_ARRAY)
      return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRADIENT, scriptIndex)
    return true
  }

  /**
   * Adds the specified color to the end of the gradient, with the specified offset.
   */
  public fun addPoint(offset: Float, color: Color): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  /**
   * Removes the color at the index [point].
   */
  public fun removePoint(point: Int): Unit {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  /**
   * Sets the offset for the gradient color at index [point].
   */
  public fun setOffset(point: Int, offset: Float): Unit {
    TransferContext.writeArguments(LONG to point.toLong(), DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
  }

  /**
   * Returns the offset of the gradient color at index [point].
   */
  public fun getOffset(point: Int): Float {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Reverses/mirrors the gradient.
   *
   * **Note:** This method mirrors all points around the middle of the gradient, which may produce unexpected results when [interpolationMode] is set to [GRADIENT_INTERPOLATE_CONSTANT].
   */
  public fun reverse(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.reversePtr, NIL)
  }

  /**
   * Sets the color of the gradient color at index [point].
   */
  public fun setColor(point: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to point.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  /**
   * Returns the color of the gradient color at index [point].
   */
  public fun getColor(point: Int): Color {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the interpolated color specified by [offset].
   */
  public fun sample(offset: Float): Color {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the number of colors in the gradient.
   */
  public fun getPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class InterpolationMode(
    id: Long,
  ) {
    /**
     * Linear interpolation.
     */
    GRADIENT_INTERPOLATE_LINEAR(0),
    /**
     * Constant interpolation, color changes abruptly at each point and stays uniform between. This might cause visible aliasing when used for a gradient texture in some cases.
     */
    GRADIENT_INTERPOLATE_CONSTANT(1),
    /**
     * Cubic interpolation.
     */
    GRADIENT_INTERPOLATE_CUBIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ColorSpace(
    id: Long,
  ) {
    /**
     * sRGB color space.
     */
    GRADIENT_COLOR_SPACE_SRGB(0),
    /**
     * Linear sRGB color space.
     */
    GRADIENT_COLOR_SPACE_LINEAR_SRGB(1),
    /**
     * [godot.Oklab](https://bottosson.github.io/posts/oklab/) color space. This color space provides a smooth and uniform-looking transition between colors.
     */
    GRADIENT_COLOR_SPACE_OKLAB(2),
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
    public val addPointPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "add_point")

    public val removePointPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "remove_point")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "get_offset")

    public val reversePtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "reverse")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "get_color")

    public val samplePtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "sample")

    public val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Gradient", "get_point_count")

    public val setOffsetsPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "set_offsets")

    public val getOffsetsPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "get_offsets")

    public val setColorsPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "set_colors")

    public val getColorsPtr: VoidPtr = TypeManager.getMethodBindPtr("Gradient", "get_colors")

    public val setInterpolationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Gradient", "set_interpolation_mode")

    public val getInterpolationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Gradient", "get_interpolation_mode")

    public val setInterpolationColorSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Gradient", "set_interpolation_color_space")

    public val getInterpolationColorSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Gradient", "get_interpolation_color_space")
  }
}
