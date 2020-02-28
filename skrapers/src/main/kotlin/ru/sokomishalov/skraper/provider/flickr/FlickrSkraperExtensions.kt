/**
 * Copyright (c) 2019-present Mikhael Sokolov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.sokomishalov.skraper.provider.flickr

import ru.sokomishalov.skraper.internal.consts.DEFAULT_LOGO_SIZE
import ru.sokomishalov.skraper.internal.consts.DEFAULT_POSTS_LIMIT
import ru.sokomishalov.skraper.model.ImageSize
import ru.sokomishalov.skraper.model.Post


/**
 * @author sokomishalov
 */

suspend fun FlickrSkraper.getExplorePosts(limit: Int = DEFAULT_POSTS_LIMIT): List<Post> {
    return getPosts(path = "/explore", limit = limit)
}

suspend fun FlickrSkraper.getUserPosts(username: String, limit: Int = DEFAULT_POSTS_LIMIT): List<Post> {
    return getPosts(path = "/photos/${username}", limit = limit)
}

suspend fun FlickrSkraper.getTagPosts(tag: String, limit: Int = DEFAULT_POSTS_LIMIT): List<Post> {
    return getPosts(path = "/photos/tag/${tag}", limit = limit)
}

suspend fun FlickrSkraper.getUserLogoUrl(username: String, imageSize: ImageSize = DEFAULT_LOGO_SIZE): String? {
    return getLogoUrl(path = "/photos/${username}", imageSize = imageSize)
}