package com.world.hello.endpoint.event.consumer.model;

import com.world.hello.PojaGenerated;
import com.world.hello.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
