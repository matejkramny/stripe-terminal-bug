package com.example.stripe_terminal

import android.app.Activity
import android.content.Context
import com.stripe.stripeterminal.Terminal
import com.stripe.stripeterminal.TerminalLifecycleObserver
import com.stripe.stripeterminal.callable.*
import com.stripe.stripeterminal.log.LogLevel
import com.stripe.stripeterminal.model.external.*
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.plugins.FlutterPlugin

class TerminalPlugin : FlutterPlugin, TerminalListener, ConnectionTokenProvider, DiscoveryListener, BluetoothReaderListener {
    private val observer: TerminalLifecycleObserver = TerminalLifecycleObserver.getInstance()
    private var activity: Activity
    private var context: Context;

    constructor(activity: Activity, engine: FlutterEngine) {
        this.activity = activity;
        this.context = activity.applicationContext

        activity.application.registerActivityLifecycleCallbacks(observer)
    }

    override fun onAttachedToEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        // this line prevents compiling with --release flag
        Terminal.initTerminal(context, LogLevel.VERBOSE, this, this)
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
    }

    override fun onRequestReaderInput(options: ReaderInputOptions) {
        super.onRequestReaderInput(options)
    }

    override fun onRequestReaderDisplayMessage(message: ReaderDisplayMessage) {
        super.onRequestReaderDisplayMessage(message)
    }

    override fun onReportReaderEvent(event: ReaderEvent) {
        super.onReportReaderEvent(event)
    }

    override fun onUnexpectedReaderDisconnect(reader: Reader) {
    }

    override fun onConnectionStatusChange(status: ConnectionStatus) {
    }

    override fun onPaymentStatusChange(status: PaymentStatus) {
    }

    override fun fetchConnectionToken(callback: ConnectionTokenCallback) {
    }

    override fun onUpdateDiscoveredReaders(readers: List<Reader>) {
    }

    override fun onReportAvailableUpdate(update: ReaderSoftwareUpdate) {
        super.onReportAvailableUpdate(update)
    }

    override fun onStartInstallingUpdate(update: ReaderSoftwareUpdate, cancelable: Cancelable) {
        super.onStartInstallingUpdate(update, cancelable)
    }

    override fun onReportReaderSoftwareUpdateProgress(progress: Float) {
        super.onReportReaderSoftwareUpdateProgress(progress)
    }

    override fun onFinishInstallingUpdate(update: ReaderSoftwareUpdate?, e: TerminalException?) {
        super.onFinishInstallingUpdate(update, e)
    }

    override fun onReportLowBatteryWarning() {
        super.onReportLowBatteryWarning()
    }
}

