/*
 *  Copyright (C) 2017 Team Gateship-One
 *  (Hendrik Borghorst & Frederik Luetkes)
 *
 *  The AUTHORS.md file contains a detailed contributors list:
 *  <https://github.com/gateship-one/malp/blob/master/AUTHORS.md>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package org.gateshipone.malp.application.artworkdatabase.network.responses;


import android.content.Context;

import com.android.volley.VolleyError;

import org.gateshipone.malp.mpdservice.mpdprotocol.mpdobjects.MPDAlbum;
import org.json.JSONException;

public interface AlbumFetchError {
    void fetchJSONException(MPDAlbum album, JSONException exception);

    void fetchVolleyError(MPDAlbum album, VolleyError error);
}
