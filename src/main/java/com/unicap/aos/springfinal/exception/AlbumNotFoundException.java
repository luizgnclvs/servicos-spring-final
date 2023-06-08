package com.unicap.aos.springfinal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class AlbumNotFoundException extends RuntimeException {
    public AlbumNotFoundException(long id) {
        super("Album of ID: {{ " + id + " }} was not found.");
    }
}
