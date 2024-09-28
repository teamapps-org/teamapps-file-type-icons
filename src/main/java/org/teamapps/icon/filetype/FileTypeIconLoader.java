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

import org.teamapps.icons.IconLoaderContext;
import org.teamapps.icons.IconResource;
import org.teamapps.icons.IconType;
import org.teamapps.icons.spi.IconLoader;

import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;

public class FileTypeIconLoader implements IconLoader<FileTypeIcon> {

    @Override
    public IconResource loadIcon(FileTypeIcon icon, int size, IconLoaderContext context) {
        FileTypeIconStyle style = icon.getStyle();
        String folder = style.getFolder();
        String resourcePath = "/org/teamapps/icon/filetype/" + folder + "/" + icon.getIconPath() + ".svg";
        byte[] svgBytes = getSVG(resourcePath);
        if (svgBytes == null){
            System.out.println(MessageFormat.format("Could not load icon {0} style: {1} from path: {2}", icon.getIconId(), icon.getStyle().getStyleId(), resourcePath));
            return null;
        }
        return new IconResource(svgBytes, IconType.SVG);
    }

    private byte[] getSVG(String resourcePath) {
        try(InputStream inputStream = getClass().getResourceAsStream(resourcePath)) {
            if (inputStream == null) {
                return null;
            }
            return inputStream.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
