/*
 * Copyright (c) 2020 Hemanth Savarla.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 */
package io.github.me0wzz.music.interfaces

import android.view.Menu
import android.view.MenuItem
import com.afollestad.materialcab.attached.AttachedCab

interface ICabCallback {
    fun onCabCreated(cab: AttachedCab, menu: Menu): Boolean

    fun onCabItemClicked(item: MenuItem): Boolean

    fun onCabFinished(cab: AttachedCab): Boolean
}