package com.sayson.narl.finals_searchalbum
import com.google.gson.annotations.SerializedName


/**
 * Created by Lran on 3/21/2018.
 */
data class album (
        val results: Results
)
data class AlbumImg(
        @SerializedName("#text") val text: String,
        val size: String
)
data class AlbumInfo(
        val name:String,
        val artist:String,
        val image: ArrayList<AlbumImg>
)
data class Results(
        val albummatches: AlbumIdentical
)
data class AlbumIdentical(
        val album: ArrayList<AlbumInfo>
)