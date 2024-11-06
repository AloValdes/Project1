package com.example.proyecto1.Network

class NetworkMonitor {

}

private fun getConnectionStatus():String{
    val networkCapabilities = connectivityManager.getNetworkCapabilities(
        connectivityManager.activeNetwork)
    val isWifiConnected = wifiManager.isWifiEnabled && networkCapabilities?.hasTransport
}