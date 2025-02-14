// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract class for non-real-time video recording encoders.
 *
 * Godot can record videos with non-real-time simulation. Like the `--fixed-fps` [command line argument]($DOCS_URL/tutorials/editor/command_line_tutorial.html), this forces the reported `delta` in [godot.Node.Process] functions to be identical across frames, regardless of how long it actually took to render the frame. This can be used to record high-quality videos with perfect frame pacing regardless of your hardware's capabilities.
 *
 * Godot has 2 built-in [godot.MovieWriter]s:
 *
 * - AVI container with MJPEG for video and uncompressed audio (`.avi` file extension). Lossy compression, medium file sizes, fast encoding. The lossy compression quality can be adjusted by changing [godot.ProjectSettings.editor/movieWriter/mjpegQuality]. The resulting file can be viewed in most video players, but it must be converted to another format for viewing on the web or by Godot with [godot.VideoStreamPlayer]. MJPEG does not support transparency. AVI output is currently limited to a file of 4 GB in size at most.
 *
 * - PNG image sequence for video and WAV for audio (`.png` file extension). Lossless compression, large file sizes, slow encoding. Designed to be encoded to a video file with another tool such as [godot.FFmpeg](https://ffmpeg.org/) after recording. Transparency is currently not supported, even if the root viewport is set to be transparent.
 *
 * If you need to encode to a different format or pipe a stream through third-party software, you can extend the [godot.MovieWriter] class to create your own movie writers. This should typically be done using GDExtension for performance reasons.
 *
 * **Editor usage:** A default movie file path can be specified in [godot.ProjectSettings.editor/movieWriter/movieFile]. Alternatively, for running single scenes, a `movie_path` metadata can be added to the root node, specifying the path to a movie file that will be used when recording that scene. Once a path is set, click the video reel icon in the top-right corner of the editor to enable Movie Maker mode, then run any scene as usual. The engine will start recording as soon as the splash screen is finished, and it will only stop recording when the engine quits. Click the video reel icon again to disable Movie Maker mode. Note that toggling Movie Maker mode does not affect project instances that are already running.
 *
 * **Note:** MovieWriter is available for use in both the editor and exported projects, but it is *not* designed for use by end users to record videos while playing. Players wishing to record gameplay videos should install tools such as [godot.OBS Studio](https://obsproject.com/) or [godot.SimpleScreenRecorder](https://www.maartenbaert.be/simplescreenrecorder/) instead.
 */
@GodotBaseType
public open class MovieWriter : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MOVIEWRITER, scriptIndex)
    return true
  }

  /**
   * Called when the audio sample rate used for recording the audio is requested by the engine. The value returned must be specified in Hz. Defaults to 48000 Hz if [_getAudioMixRate] is not overridden.
   */
  public open fun _getAudioMixRate(): Long {
    throw NotImplementedError("_get_audio_mix_rate is not implemented for MovieWriter")
  }

  /**
   * Called when the audio speaker mode used for recording the audio is requested by the engine. This can affect the number of output channels in the resulting audio file/stream. Defaults to [godot.AudioServer.SPEAKER_MODE_STEREO] if [_getAudioSpeakerMode] is not overridden.
   */
  public open fun _getAudioSpeakerMode(): AudioServer.SpeakerMode {
    throw NotImplementedError("_get_audio_speaker_mode is not implemented for MovieWriter")
  }

  /**
   * Called when the engine determines whether this [godot.MovieWriter] is able to handle the file at [path]. Must return `true` if this [godot.MovieWriter] is able to handle the given file path, `false` otherwise. Typically, [_handlesFile] is overridden as follows to allow the user to record a file at any path with a given file extension:
   *
   * ```
   * 				func _handles_file(path):
   * 				    # Allows specifying an output file with a `.mkv` file extension (case-insensitive),
   * 				    # either in the Project Settings or with the `--write-movie <path>` command line argument.
   * 				    return path.get_extension().to_lower() == "mkv"
   * 				```
   */
  public open fun _handlesFile(path: String): Boolean {
    throw NotImplementedError("_handles_file is not implemented for MovieWriter")
  }

  /**
   * Called once before the engine starts writing video and audio data. [movieSize] is the width and height of the video to save. [fps] is the number of frames per second specified in the project settings or using the `--fixed-fps <fps>` [command line argument]($DOCS_URL/tutorials/editor/command_line_tutorial.html).
   */
  public open fun _writeBegin(
    movieSize: Vector2i,
    fps: Long,
    basePath: String,
  ): GodotError {
    throw NotImplementedError("_write_begin is not implemented for MovieWriter")
  }

  /**
   * Called when the engine finishes writing. This occurs when the engine quits by pressing the window manager's close button, or when [godot.SceneTree.quit] is called.
   *
   * **Note:** Pressing [kbd]Ctrl + C[/kbd] on the terminal running the editor/project does *not* result in [_writeEnd] being called.
   */
  public open fun _writeEnd(): Unit {
  }

  public companion object {
    /**
     * Adds a writer to be usable by the engine. The supported file extensions can be set by overriding [_handlesFile].
     *
     * **Note:** [addWriter] must be called early enough in the engine initialization to work, as movie writing is designed to start at the same time as the rest of the engine.
     */
    public fun addWriter(writer: MovieWriter): Unit {
      TransferContext.writeArguments(OBJECT to writer)
      TransferContext.callMethod(0, MethodBindings.addWriterPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val _getAudioMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MovieWriter", "_get_audio_mix_rate")

    public val _getAudioSpeakerModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MovieWriter", "_get_audio_speaker_mode")

    public val _handlesFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MovieWriter", "_handles_file")

    public val _writeBeginPtr: VoidPtr = TypeManager.getMethodBindPtr("MovieWriter", "_write_begin")

    public val _writeFramePtr: VoidPtr = TypeManager.getMethodBindPtr("MovieWriter", "_write_frame")

    public val _writeEndPtr: VoidPtr = TypeManager.getMethodBindPtr("MovieWriter", "_write_end")

    public val addWriterPtr: VoidPtr = TypeManager.getMethodBindPtr("MovieWriter", "add_writer")
  }
}
