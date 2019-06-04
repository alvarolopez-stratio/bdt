/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.qa.cucumber.converter;

import java.util.ArrayList;
import java.util.List;

public class Strokes {

    private List<String> strokesList;

    public Strokes(String input) {
        strokesList = new ArrayList<>();
        String[] aInput = input.split(",");
        for (String content : aInput) {
            if (content.trim().equals("")) {
                strokesList.add(content);
            } else {
                strokesList.add(content.trim());
            }
        }
    }

    public List<String> getStrokesList() {
        return strokesList;
    }
}