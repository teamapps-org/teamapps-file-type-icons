/*-
 * ========================LICENSE_START=================================
 * TeamApps FileType Icon Provider
 * ---
 * Copyright (C) 2024 TeamApps.org
 * ---
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
 * =========================LICENSE_END==================================
 */
package org.teamapps.icon.filetype;

import java.util.List;

public class FileTypeIconStyle {

    public static final FileTypeIconStyle SIMPLE = new FileTypeIconStyle("SIMPLE", "square");
    public static final FileTypeIconStyle DETAIL = new FileTypeIconStyle("DETAIL", "vivid");

    private final String styleId;
    private final String folder;

    public FileTypeIconStyle(String styleId, String folder) {
        this.styleId = styleId;
        this.folder = folder;
    }

    public String getFolder() {
        return folder;
    }

    public String getStyleId() {
        return styleId;
    }
    public static List<FileTypeIconStyle> getStyles(){
        return List.of(
                FileTypeIconStyle.SIMPLE,
                FileTypeIconStyle.DETAIL
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileTypeIconStyle iconStyle = (FileTypeIconStyle) o;

        return styleId.equals(iconStyle.styleId);
    }

    @Override
    public int hashCode() {
        return styleId.hashCode();
    }
}
