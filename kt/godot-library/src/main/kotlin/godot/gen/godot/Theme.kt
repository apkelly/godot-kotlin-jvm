// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Theme for controls.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_skinning.html]($DOCS_URL/tutorials/ui/gui_skinning.html)
 *
 * A theme for skinning controls. Controls can be skinned individually, but for complex applications, it's more practical to just create a global theme that defines everything. This theme can be applied to any [godot.Control]; the Control and its children will automatically use it.
 *
 * Theme resources can alternatively be loaded by writing them in a `.theme` file, see the documentation for more information.
 */
@GodotBaseType
public open class Theme : Resource() {
  /**
   * The default font of this [godot.Theme] resource. Used as a fallback value for font items defined in this theme, but having invalid values. If this value is also invalid, the global default value is used.
   *
   * Use [hasDefaultFont] to check if this value is valid.
   */
  public open var defaultFont: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_DEFAULT_FONT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Font?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_DEFAULT_FONT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_THEME)
  }

  public open fun _emitThemeChanged(notifyListChanged: Boolean = false): Unit {
  }

  /**
   * Adds an empty theme type for every valid data type.
   *
   * **Note:** Empty types are not saved with the theme. This method only exists to perform in-memory changes to the resource. Use available `set_*` methods to add theme items.
   */
  public open fun addType(themeType: String): Unit {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_ADD_TYPE, NIL)
  }

  /**
   * Clears all values on the theme.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR, NIL)
  }

  /**
   * Clears the [godot.core.Color] at `name` if the theme has `node_type`.
   */
  public open fun clearColor(name: String, themeType: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_COLOR, NIL)
  }

  /**
   * Clears the constant at `name` if the theme has `node_type`.
   */
  public open fun clearConstant(name: String, themeType: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_CONSTANT, NIL)
  }

  /**
   * Clears the [godot.Font] at `name` if the theme has `node_type`.
   */
  public open fun clearFont(name: String, themeType: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_FONT, NIL)
  }

  /**
   * Clears the icon at `name` if the theme has `node_type`.
   */
  public open fun clearIcon(name: String, themeType: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_ICON, NIL)
  }

  /**
   * Clears [godot.StyleBox] at `name` if the theme has `node_type`.
   */
  public open fun clearStylebox(name: String, themeType: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_STYLEBOX, NIL)
  }

  /**
   * Clears the theme item of `data_type` at `name` if the theme has `node_type`.
   */
  public open fun clearThemeItem(
    dataType: Long,
    name: String,
    themeType: String
  ): Unit {
    TransferContext.writeArguments(LONG to dataType, STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_THEME_ITEM, NIL)
  }

  /**
   * Unmarks `theme_type` as being a variation of another theme type. See [setTypeVariation].
   */
  public open fun clearTypeVariation(themeType: String): Unit {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_CLEAR_TYPE_VARIATION, NIL)
  }

  /**
   * Sets the theme's values to a copy of the default theme values.
   */
  public open fun copyDefaultTheme(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_COPY_DEFAULT_THEME, NIL)
  }

  /**
   * Sets the theme's values to a copy of a given theme.
   */
  public open fun copyTheme(other: Theme): Unit {
    TransferContext.writeArguments(OBJECT to other)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_COPY_THEME, NIL)
  }

  /**
   * Returns the [godot.core.Color] at `name` if the theme has `node_type`.
   */
  public open fun getColor(name: String, themeType: String): Color {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns all the [godot.core.Color]s as a [godot.core.PoolStringArray] filled with each [godot.core.Color]'s name, for use in [getColor], if the theme has `node_type`.
   */
  public open fun getColorList(themeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_COLOR_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns all the [godot.core.Color] types as a [godot.core.PoolStringArray] filled with unique type names, for use in [getColor] and/or [getColorList].
   */
  public open fun getColorTypes(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_COLOR_TYPES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the constant at `name` if the theme has `node_type`.
   */
  public open fun getConstant(name: String, themeType: String): Long {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_CONSTANT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns all the constants as a [godot.core.PoolStringArray] filled with each constant's name, for use in [getConstant], if the theme has `node_type`.
   */
  public open fun getConstantList(themeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_CONSTANT_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns all the constant types as a [godot.core.PoolStringArray] filled with unique type names, for use in [getConstant] and/or [getConstantList].
   */
  public open fun getConstantTypes(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_CONSTANT_TYPES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the [godot.Font] at `name` if the theme has `node_type`. If such item does not exist and [defaultFont] is set on the theme, the default font will be returned.
   */
  public open fun getFont(name: String, themeType: String): Font? {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   * Returns all the [godot.Font]s as a [godot.core.PoolStringArray] filled with each [godot.Font]'s name, for use in [getFont], if the theme has `node_type`.
   */
  public open fun getFontList(themeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns all the [godot.Font] types as a [godot.core.PoolStringArray] filled with unique type names, for use in [getFont] and/or [getFontList].
   */
  public open fun getFontTypes(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_FONT_TYPES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the icon [godot.Texture] at `name` if the theme has `node_type`.
   */
  public open fun getIcon(name: String, themeType: String): Texture? {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns all the icons as a [godot.core.PoolStringArray] filled with each [godot.Texture]'s name, for use in [getIcon], if the theme has `node_type`.
   */
  public open fun getIconList(themeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_ICON_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns all the icon types as a [godot.core.PoolStringArray] filled with unique type names, for use in [getIcon] and/or [getIconList].
   */
  public open fun getIconTypes(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_ICON_TYPES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the [godot.StyleBox] at `name` if the theme has `node_type`.
   *
   * Valid `name`s may be found using [getStyleboxList]. Valid `node_type`s may be found using [getStyleboxTypes].
   */
  public open fun getStylebox(name: String, themeType: String): StyleBox? {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StyleBox?
  }

  /**
   * Returns all the [godot.StyleBox]s as a [godot.core.PoolStringArray] filled with each [godot.StyleBox]'s name, for use in [getStylebox], if the theme has `node_type`.
   *
   * Valid `node_type`s may be found using [getStyleboxTypes].
   */
  public open fun getStyleboxList(themeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns all the [godot.StyleBox] types as a [godot.core.PoolStringArray] filled with unique type names, for use in [getStylebox] and/or [getStyleboxList].
   */
  public open fun getStyleboxTypes(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_STYLEBOX_TYPES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the theme item of `data_type` at `name` if the theme has `node_type`.
   *
   * Valid `name`s may be found using [getThemeItemList] or a data type specific method. Valid `node_type`s may be found using [getThemeItemTypes] or a data type specific method.
   */
  public open fun getThemeItem(
    dataType: Long,
    name: String,
    themeType: String
  ): Any? {
    TransferContext.writeArguments(LONG to dataType, STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_THEME_ITEM, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns all the theme items of `data_type` as a [godot.core.PoolStringArray] filled with each theme items's name, for use in [getThemeItem] or a data type specific method, if the theme has `node_type`.
   *
   * Valid `node_type`s may be found using [getThemeItemTypes] or a data type specific method.
   */
  public open fun getThemeItemList(dataType: Long, themeType: String): PoolStringArray {
    TransferContext.writeArguments(LONG to dataType, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_THEME_ITEM_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns all the theme items of `data_type` types as a [godot.core.PoolStringArray] filled with unique type names, for use in [getThemeItem], [getThemeItemList] or data type specific methods.
   */
  public open fun getThemeItemTypes(dataType: Long): PoolStringArray {
    TransferContext.writeArguments(LONG to dataType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_THEME_ITEM_TYPES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns all the theme types as a [godot.core.PoolStringArray] filled with unique type names, for use in other `get_*` functions of this theme.
   *
   * **Note:** `node_type` has no effect and will be removed in future version.
   */
  public open fun getTypeList(themeType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_TYPE_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the name of the base theme type if `theme_type` is a valid variation type. Returns an empty string otherwise.
   */
  public open fun getTypeVariationBase(themeType: String): String {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_TYPE_VARIATION_BASE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a list of all type variations for the given `base_type`.
   */
  public open fun getTypeVariationList(baseType: String): PoolStringArray {
    TransferContext.writeArguments(STRING to baseType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_GET_TYPE_VARIATION_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns `true` if [godot.core.Color] with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasColor(name: String, themeType: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if constant with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasConstant(name: String, themeType: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_CONSTANT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this theme has a valid [defaultFont] value.
   */
  public open fun hasDefaultFont(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_DEFAULT_FONT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.Font] with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasFont(name: String, themeType: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_FONT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if icon [godot.Texture] with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasIcon(name: String, themeType: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_ICON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.StyleBox] with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasStylebox(name: String, themeType: String): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_STYLEBOX, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if a theme item of `data_type` with `name` is in `node_type`.
   *
   * Returns `false` if the theme does not have `node_type`.
   */
  public open fun hasThemeItem(
    dataType: Long,
    name: String,
    themeType: String
  ): Boolean {
    TransferContext.writeArguments(LONG to dataType, STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_HAS_THEME_ITEM, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if `theme_type` is marked as a variation of `base_type`.
   */
  public open fun isTypeVariation(themeType: String, baseType: String): Boolean {
    TransferContext.writeArguments(STRING to themeType, STRING to baseType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_IS_TYPE_VARIATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds missing and overrides existing definitions with values from the `other` [godot.Theme].
   *
   * **Note:** This modifies the current theme. If you want to merge two themes together without modifying either one, create a new empty theme and merge the other two into it one after another.
   */
  public open fun mergeWith(other: Theme): Unit {
    TransferContext.writeArguments(OBJECT to other)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_MERGE_WITH, NIL)
  }

  /**
   * Removes the theme type, gracefully discarding defined theme items. If the type is a variation, this information is also erased. If the type is a base for type variations, those variations lose their base.
   */
  public open fun removeType(themeType: String): Unit {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_REMOVE_TYPE, NIL)
  }

  /**
   * Renames the [godot.core.Color] at `old_name` to `name` if the theme has `node_type`. If `name` is already taken, this method fails.
   */
  public open fun renameColor(
    oldName: String,
    name: String,
    themeType: String
  ): Unit {
    TransferContext.writeArguments(STRING to oldName, STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_COLOR, NIL)
  }

  /**
   * Renames the constant at `old_name` to `name` if the theme has `node_type`. If `name` is already taken, this method fails.
   */
  public open fun renameConstant(
    oldName: String,
    name: String,
    themeType: String
  ): Unit {
    TransferContext.writeArguments(STRING to oldName, STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_CONSTANT, NIL)
  }

  /**
   * Renames the [godot.Font] at `old_name` to `name` if the theme has `node_type`. If `name` is already taken, this method fails.
   */
  public open fun renameFont(
    oldName: String,
    name: String,
    themeType: String
  ): Unit {
    TransferContext.writeArguments(STRING to oldName, STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_FONT, NIL)
  }

  /**
   * Renames the icon at `old_name` to `name` if the theme has `node_type`. If `name` is already taken, this method fails.
   */
  public open fun renameIcon(
    oldName: String,
    name: String,
    themeType: String
  ): Unit {
    TransferContext.writeArguments(STRING to oldName, STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_ICON, NIL)
  }

  /**
   * Renames [godot.StyleBox] at `old_name` to `name` if the theme has `node_type`. If `name` is already taken, this method fails.
   */
  public open fun renameStylebox(
    oldName: String,
    name: String,
    themeType: String
  ): Unit {
    TransferContext.writeArguments(STRING to oldName, STRING to name, STRING to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_STYLEBOX, NIL)
  }

  /**
   * Renames the theme item of `data_type` at `old_name` to `name` if the theme has `node_type`. If `name` is already taken, this method fails.
   */
  public open fun renameThemeItem(
    dataType: Long,
    oldName: String,
    name: String,
    themeType: String
  ): Unit {
    TransferContext.writeArguments(LONG to dataType, STRING to oldName, STRING to name, STRING to
        themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_RENAME_THEME_ITEM, NIL)
  }

  /**
   * Sets the theme's [godot.core.Color] to `color` at `name` in `node_type`.
   *
   * Creates `node_type` if the theme does not have it.
   */
  public open fun setColor(
    name: String,
    themeType: String,
    color: Color
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to themeType, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_COLOR, NIL)
  }

  /**
   * Sets the theme's constant to `constant` at `name` in `node_type`.
   *
   * Creates `node_type` if the theme does not have it.
   */
  public open fun setConstant(
    name: String,
    themeType: String,
    constant: Long
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to themeType, LONG to constant)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_CONSTANT, NIL)
  }

  /**
   * Sets the theme's [godot.Font] to `font` at `name` in `node_type`.
   *
   * Creates `node_type` if the theme does not have it.
   */
  public open fun setFont(
    name: String,
    themeType: String,
    font: Font
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to themeType, OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_FONT, NIL)
  }

  /**
   * Sets the theme's icon [godot.Texture] to `texture` at `name` in `node_type`.
   *
   * Creates `node_type` if the theme does not have it.
   */
  public open fun setIcon(
    name: String,
    themeType: String,
    texture: Texture
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to themeType, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_ICON, NIL)
  }

  /**
   * Sets theme's [godot.StyleBox] to `stylebox` at `name` in `node_type`.
   *
   * Creates `node_type` if the theme does not have it.
   */
  public open fun setStylebox(
    name: String,
    themeType: String,
    texture: StyleBox
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to themeType, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_STYLEBOX, NIL)
  }

  /**
   * Sets the theme item of `data_type` to `value` at `name` in `node_type`.
   *
   * Does nothing if the `value` type does not match `data_type`.
   *
   * Creates `node_type` if the theme does not have it.
   */
  public open fun setThemeItem(
    dataType: Long,
    name: String,
    themeType: String,
    `value`: Any?
  ): Unit {
    TransferContext.writeArguments(LONG to dataType, STRING to name, STRING to themeType, ANY to
        value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_THEME_ITEM, NIL)
  }

  /**
   * Marks `theme_type` as a variation of `base_type`.
   *
   * This adds `theme_type` as a suggested option for [godot.Control.themeTypeVariation] on a [godot.Control] that is of the `base_type` class.
   *
   * Variations can also be nested, i.e. `base_type` can be another variation. If a chain of variations ends with a `base_type` matching the class of the [godot.Control], the whole chain is going to be suggested as options.
   *
   * **Note:** Suggestions only show up if this theme resource is set as the project default theme. See [godot.ProjectSettings.gui/theme/custom].
   */
  public open fun setTypeVariation(themeType: String, baseType: String): Unit {
    TransferContext.writeArguments(STRING to themeType, STRING to baseType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEME_SET_TYPE_VARIATION, NIL)
  }

  public enum class DataType(
    id: Long
  ) {
    /**
     * Theme's [godot.core.Color] item type.
     */
    DATA_TYPE_COLOR(0),
    /**
     * Theme's constant item type.
     */
    DATA_TYPE_CONSTANT(1),
    /**
     * Theme's [godot.Font] item type.
     */
    DATA_TYPE_FONT(2),
    /**
     * Theme's icon [godot.Texture] item type.
     */
    DATA_TYPE_ICON(3),
    /**
     * Theme's [godot.StyleBox] item type.
     */
    DATA_TYPE_STYLEBOX(4),
    /**
     * Maximum value for the DataType enum.
     */
    DATA_TYPE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Theme's [godot.core.Color] item type.
     */
    public final const val DATA_TYPE_COLOR: Long = 0

    /**
     * Theme's constant item type.
     */
    public final const val DATA_TYPE_CONSTANT: Long = 1

    /**
     * Theme's [godot.Font] item type.
     */
    public final const val DATA_TYPE_FONT: Long = 2

    /**
     * Theme's icon [godot.Texture] item type.
     */
    public final const val DATA_TYPE_ICON: Long = 3

    /**
     * Maximum value for the DataType enum.
     */
    public final const val DATA_TYPE_MAX: Long = 5

    /**
     * Theme's [godot.StyleBox] item type.
     */
    public final const val DATA_TYPE_STYLEBOX: Long = 4
  }
}
