package com.example.proyecto1.ui.theme.location

data class GoogleGeoResult(
    val results: List<Results>
)
data class Results(
    val geometry: Geometry,
    val formatted_address: String
)

data class Geometry(
    val location: Location
)

data class Location(
    val lat: Double,
    val lng: Double
)