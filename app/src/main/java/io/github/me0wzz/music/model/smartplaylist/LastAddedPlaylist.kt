package io.github.me0wzz.music.model.smartplaylist

import io.github.me0wzz.music.App
import io.github.me0wzz.music.R
import io.github.me0wzz.music.model.Song
import kotlinx.parcelize.Parcelize

@Parcelize
class LastAddedPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.last_added),
    iconRes = R.drawable.ic_library_add
) {
    override fun songs(): List<Song> {
        return lastAddedRepository.recentSongs()
    }
}