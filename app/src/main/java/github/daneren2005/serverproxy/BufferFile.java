/*
	This file is part of ServerProxy.
	SocketProxy is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.
	Subsonic is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
	GNU General Public License for more details.
	You should have received a copy of the GNU General Public License
	along with Subsonic. If not, see <http://www.gnu.org/licenses/>.
	Copyright 2014 (C) Scott Jackson
*/

package github.daneren2005.serverproxy;

import java.io.File;

public interface BufferFile {
	/** File being buffered. */
	File getFile();
	/**
	 * Content length which is passed as a header.
	 * ONLY set if you absolutely know for certain the end size of the file.
	 */
	Long getContentLength();
	/**
	 * The guessed size of the file.
	 * It is used to keep track of how much more data needs to be processed.
	 * It should be relatively close.
	 */
	long getEstimatedSize();
	/** Whether or not the file is done being downloaded. */
	boolean isWorkDone();
	/** Called when the streaming starts. */
	void onStart();
	/** Called when the streaming stops. */
	void onStop();
	/** Called when the streaming resumes. */
	void onResume();
}
