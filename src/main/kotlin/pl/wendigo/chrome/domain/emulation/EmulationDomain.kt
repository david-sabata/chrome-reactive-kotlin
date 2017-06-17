package pl.wendigo.chrome.domain.emulation

/**
 * This domain emulates different environments for the page.
 */
class EmulationDomain internal constructor(private val connectionRemote : pl.wendigo.chrome.DebuggerProtocol) {
    /**
     * Overrides the values of device screen dimensions (window.screen.width, window.screen.height, window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media query results).
     */
    fun setDeviceMetricsOverride(input : SetDeviceMetricsOverrideRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.setDeviceMetricsOverride", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Clears the overriden device metrics.
     */
    fun clearDeviceMetricsOverride() : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.clearDeviceMetricsOverride", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Overrides the visible area of the page. The change is hidden from the page, i.e. the observable scroll position and page scale does not change. In effect, the command moves the specified area of the page into the top-left corner of the frame.
     */
    fun forceViewport(input : ForceViewportRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.forceViewport", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Resets the visible area of the page to the original viewport, undoing any effects of the <code>forceViewport</code> command.
     */
    fun resetViewport() : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.resetViewport", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Requests that page scale factor is reset to initial values.
     */
    fun resetPageScaleFactor() : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.resetPageScaleFactor", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Sets a specified page scale factor.
     */
    fun setPageScaleFactor(input : SetPageScaleFactorRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.setPageScaleFactor", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Resizes the frame/viewport of the page. Note that this does not affect the frame's container (e.g. browser window). Can be used to produce screenshots of the specified size. Not supported on Android.
     */
    fun setVisibleSize(input : SetVisibleSizeRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.setVisibleSize", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Switches script execution in the page.
     */
    fun setScriptExecutionDisabled(input : SetScriptExecutionDisabledRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.setScriptExecutionDisabled", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position unavailable.
     */
    fun setGeolocationOverride(input : SetGeolocationOverrideRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.setGeolocationOverride", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Clears the overriden Geolocation Position and Error.
     */
    fun clearGeolocationOverride() : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.clearGeolocationOverride", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Toggles mouse event-based touch event emulation.
     */
    fun setTouchEmulationEnabled(input : SetTouchEmulationEnabledRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.setTouchEmulationEnabled", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Emulates the given media for CSS media queries.
     */
    fun setEmulatedMedia(input : SetEmulatedMediaRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.setEmulatedMedia", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enables CPU throttling to emulate slow CPUs.
     */
    fun setCPUThrottlingRate(input : SetCPUThrottlingRateRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.setCPUThrottlingRate", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Tells whether emulation is supported.
     */
    fun canEmulate() : io.reactivex.Single<CanEmulateResponse> {
        return connectionRemote.runAndCaptureResponse("Emulation.canEmulate", null, CanEmulateResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Turns on virtual time for all frames (replacing real-time with a synthetic time source) and sets the current virtual time policy.  Note this supersedes any previous time budget.
     */
    fun setVirtualTimePolicy(input : SetVirtualTimePolicyRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.setVirtualTimePolicy", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Sets or clears an override of the default background color of the frame. This override is used if the content does not specify one.
     */
    fun setDefaultBackgroundColorOverride(input : SetDefaultBackgroundColorOverrideRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Emulation.setDefaultBackgroundColorOverride", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Notification sent after the virual time budget for the current VirtualTimePolicy has run out.
     */
    fun virtualTimeBudgetExpired() : io.reactivex.Flowable<pl.wendigo.chrome.ProtocolEvent> {
        return virtualTimeBudgetExpiredTimed().map {
            it.value()
        }
    }

    /**
     * Notification sent after the virual time budget for the current VirtualTimePolicy has run out.
     */
    fun virtualTimeBudgetExpiredTimed() : io.reactivex.Flowable<io.reactivex.schedulers.Timed<pl.wendigo.chrome.ProtocolEvent>> {
        return connectionRemote.captureEvents("Emulation.virtualTimeBudgetExpired", pl.wendigo.chrome.ProtocolEvent::class.java)
    }

    /**
     * Returns flowable capturing all Emulation domains events.
     */
    fun events() : io.reactivex.Flowable<pl.wendigo.chrome.ProtocolEvent> {
        return connectionRemote.captureAllEvents().map { it.value() }.filter {
            it.protocolDomain() == "Emulation"
        }
    }
}
/**
 * Represents requestFrame parameters that can be used with Emulation.setDeviceMetricsOverride method call.
 *
 * Overrides the values of device screen dimensions (window.screen.width, window.screen.height, window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media query results).
 */
data class SetDeviceMetricsOverrideRequest (
    /**
     * Overriding width value in pixels (minimum 0, maximum 10000000). 0 disables the override.
     */
    val width : Int,

    /**
     * Overriding height value in pixels (minimum 0, maximum 10000000). 0 disables the override.
     */
    val height : Int,

    /**
     * Overriding device scale factor value. 0 disables the override.
     */
    val deviceScaleFactor : Double,

    /**
     * Whether to emulate mobile device. This includes viewport meta tag, overlay scrollbars, text autosizing and more.
     */
    val mobile : Boolean,

    /**
     * Whether a view that exceeds the available browser window area should be scaled down to fit.
     */
    val fitWindow : Boolean,

    /**
     * Scale to apply to resulting view image. Ignored in |fitWindow| mode.
     */
    @pl.wendigo.chrome.Experimental val scale : Double? = null,

    /**
     * Not used.
     */
    @pl.wendigo.chrome.Experimental @pl.wendigo.chrome.Deprecated val offsetX : Double? = null,

    /**
     * Not used.
     */
    @pl.wendigo.chrome.Experimental @pl.wendigo.chrome.Deprecated val offsetY : Double? = null,

    /**
     * Overriding screen width value in pixels (minimum 0, maximum 10000000). Only used for |mobile==true|.
     */
    @pl.wendigo.chrome.Experimental val screenWidth : Int? = null,

    /**
     * Overriding screen height value in pixels (minimum 0, maximum 10000000). Only used for |mobile==true|.
     */
    @pl.wendigo.chrome.Experimental val screenHeight : Int? = null,

    /**
     * Overriding view X position on screen in pixels (minimum 0, maximum 10000000). Only used for |mobile==true|.
     */
    @pl.wendigo.chrome.Experimental val positionX : Int? = null,

    /**
     * Overriding view Y position on screen in pixels (minimum 0, maximum 10000000). Only used for |mobile==true|.
     */
    @pl.wendigo.chrome.Experimental val positionY : Int? = null,

    /**
     * Screen orientation override.
     */
    val screenOrientation : ScreenOrientation? = null

)

/**
 * Represents requestFrame parameters that can be used with Emulation.forceViewport method call.
 *
 * Overrides the visible area of the page. The change is hidden from the page, i.e. the observable scroll position and page scale does not change. In effect, the command moves the specified area of the page into the top-left corner of the frame.
 */
data class ForceViewportRequest (
    /**
     * X coordinate of top-left corner of the area (CSS pixels).
     */
    val x : Double,

    /**
     * Y coordinate of top-left corner of the area (CSS pixels).
     */
    val y : Double,

    /**
     * Scale to apply to the area (relative to a page scale of 1.0).
     */
    val scale : Double

)

/**
 * Represents requestFrame parameters that can be used with Emulation.setPageScaleFactor method call.
 *
 * Sets a specified page scale factor.
 */
data class SetPageScaleFactorRequest (
    /**
     * Page scale factor.
     */
    val pageScaleFactor : Double

)

/**
 * Represents requestFrame parameters that can be used with Emulation.setVisibleSize method call.
 *
 * Resizes the frame/viewport of the page. Note that this does not affect the frame's container (e.g. browser window). Can be used to produce screenshots of the specified size. Not supported on Android.
 */
data class SetVisibleSizeRequest (
    /**
     * Frame width (DIP).
     */
    val width : Int,

    /**
     * Frame height (DIP).
     */
    val height : Int

)

/**
 * Represents requestFrame parameters that can be used with Emulation.setScriptExecutionDisabled method call.
 *
 * Switches script execution in the page.
 */
data class SetScriptExecutionDisabledRequest (
    /**
     * Whether script execution should be disabled in the page.
     */
    val value : Boolean

)

/**
 * Represents requestFrame parameters that can be used with Emulation.setGeolocationOverride method call.
 *
 * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position unavailable.
 */
data class SetGeolocationOverrideRequest (
    /**
     * Mock latitude
     */
    val latitude : Double? = null,

    /**
     * Mock longitude
     */
    val longitude : Double? = null,

    /**
     * Mock accuracy
     */
    val accuracy : Double? = null

)

/**
 * Represents requestFrame parameters that can be used with Emulation.setTouchEmulationEnabled method call.
 *
 * Toggles mouse event-based touch event emulation.
 */
data class SetTouchEmulationEnabledRequest (
    /**
     * Whether the touch event emulation should be enabled.
     */
    val enabled : Boolean,

    /**
     * Touch/gesture events configuration. Default: current platform.
     */
    val configuration : String? = null

)

/**
 * Represents requestFrame parameters that can be used with Emulation.setEmulatedMedia method call.
 *
 * Emulates the given media for CSS media queries.
 */
data class SetEmulatedMediaRequest (
    /**
     * Media type to emulate. Empty string disables the override.
     */
    val media : String

)

/**
 * Represents requestFrame parameters that can be used with Emulation.setCPUThrottlingRate method call.
 *
 * Enables CPU throttling to emulate slow CPUs.
 */
data class SetCPUThrottlingRateRequest (
    /**
     * Throttling rate as a slowdown factor (1 is no throttle, 2 is 2x slowdown, etc).
     */
    val rate : Double

)

/**
 * Represents responseFrame from Emulation. method call.
 *
 * Tells whether emulation is supported.
 */
data class CanEmulateResponse(
  /**
   * True if emulation is supported.
   */
  val result : Boolean

)

/**
 * Represents requestFrame parameters that can be used with Emulation.setVirtualTimePolicy method call.
 *
 * Turns on virtual time for all frames (replacing real-time with a synthetic time source) and sets the current virtual time policy.  Note this supersedes any previous time budget.
 */
data class SetVirtualTimePolicyRequest (
    /**
     *
     */
    val policy : VirtualTimePolicy,

    /**
     * If set, after this many virtual milliseconds have elapsed virtual time will be paused and a virtualTimeBudgetExpired event is sent.
     */
    val budget : Int? = null

)

/**
 * Represents requestFrame parameters that can be used with Emulation.setDefaultBackgroundColorOverride method call.
 *
 * Sets or clears an override of the default background color of the frame. This override is used if the content does not specify one.
 */
data class SetDefaultBackgroundColorOverrideRequest (
    /**
     * RGBA of the default background color. If not specified, any existing override will be cleared.
     */
    val color : pl.wendigo.chrome.domain.dom.RGBA? = null

)

