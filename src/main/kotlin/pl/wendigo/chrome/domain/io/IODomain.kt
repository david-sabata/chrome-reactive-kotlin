package pl.wendigo.chrome.domain.io

/**
 * Input/Output operations for streams produced by DevTools.
 */
class IODomain internal constructor(private val connectionRemote : pl.wendigo.chrome.DebuggerProtocol) {
    /**
     * Read a chunk of the stream
     */
    fun read(input : ReadRequest) : io.reactivex.Single<ReadResponse> {
        return connectionRemote.runAndCaptureResponse("IO.read", input, ReadResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Close the stream, discard any temporary backing storage.
     */
    fun close(input : CloseRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("IO.close", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Returns flowable capturing all IO domains events.
     */
    fun events() : io.reactivex.Flowable<pl.wendigo.chrome.ProtocolEvent> {
        return connectionRemote.captureAllEvents().map { it.value() }.filter {
            it.protocolDomain() == "IO"
        }
    }
}
/**
 * Represents requestFrame parameters that can be used with IO.read method call.
 *
 * Read a chunk of the stream
 */
data class ReadRequest (
    /**
     * Handle of the stream to read.
     */
    val handle : StreamHandle,

    /**
     * Seek to the specified offset before reading (if not specificed, proceed with offset following the last read).
     */
    val offset : Int? = null,

    /**
     * Maximum number of bytes to read (left upon the agent discretion if not specified).
     */
    val size : Int? = null

)

/**
 * Represents responseFrame from IO. method call.
 *
 * Read a chunk of the stream
 */
data class ReadResponse(
  /**
   * Data that were read.
   */
  val data : String,

  /**
   * Set if the end-of-file condition occured while reading.
   */
  val eof : Boolean

)

/**
 * Represents requestFrame parameters that can be used with IO.close method call.
 *
 * Close the stream, discard any temporary backing storage.
 */
data class CloseRequest (
    /**
     * Handle of the stream to close.
     */
    val handle : StreamHandle

)

