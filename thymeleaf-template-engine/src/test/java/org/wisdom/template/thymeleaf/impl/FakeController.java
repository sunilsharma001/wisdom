/*
 * #%L
 * Wisdom-Framework
 * %%
 * Copyright (C) 2013 - 2014 Wisdom Framework
 * %%
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
 * #L%
 */
package org.wisdom.template.thymeleaf.impl;

import com.google.common.collect.ImmutableList;
import org.wisdom.api.Controller;
import org.wisdom.api.http.HttpMethod;
import org.wisdom.api.http.Result;
import org.wisdom.api.http.Results;
import org.wisdom.api.router.Route;
import org.wisdom.api.router.RouteBuilder;

import java.util.List;

/**
 *
 */
public class FakeController implements Controller {


    public Result retrieve() {
        return Results.ok("hello");
    }

    @Override
    public List<Route> routes() {
        return ImmutableList.<Route>of(
                new RouteBuilder().route(HttpMethod.GET).on("/").to(this, "retrieve")
        );
    }
}
