package com.racayita.myelection.model

import com.google.gson.annotations.SerializedName

data class YouTubeUrlResponse(

	@field:SerializedName("author_name")
	val authorName: String? = null,

	@field:SerializedName("provider_url")
	val providerUrl: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("thumbnail_url")
	val thumbnailUrl: String? = null,

	@field:SerializedName("version")
	val version: String? = null,

	@field:SerializedName("thumbnail_height")
	val thumbnailHeight: Int? = null,

	@field:SerializedName("author_url")
	val authorUrl: String? = null,

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("thumbnail_width")
	val thumbnailWidth: Int? = null,

	@field:SerializedName("html")
	val html: String? = null,

	@field:SerializedName("provider_name")
	val providerName: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)
