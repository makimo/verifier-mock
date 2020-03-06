# verifier-mock

This application is mock service that serves as a token verifier in
Kajappka. This application provides two endpoints:

* `GET /success` which returns success response with user data,
* `GET /failure` which returns unauthorized response.

The following environment variables can be used to customize the
response:

* `HOST` - the host which the verifier listens on, defaults to
  `0.0.0.0`,
* `PORT` - the port which the verifier listens on, defaults to `8000`,
* `EMAIL` - the e-mail address returned in user data, defaults to
  `test@makimo.pl`,
* `NICKNAME` - the nickname returned in user data, defaults to `Makimo Test User`,
* `PROFILE_PHOTO` - the URL of profile photo returned in user data,
  defaults to `https://fillmurray.com/300/300`,
* `USER_ID` - the user ID returned in user data, defaults to `ui-12345`.

## Usage

The recommended way to use this service is to use provided docker image:

```
$ docker run --rm -it -p 8000:8000 docker.pkg.github.com/makimo/verifier-mock/verifier-mock:latest
```

The verifier service will be available at `http://localhost:8000`.

Or within the `docker-compose.yml`:

```
services:
    verifier-mock:
        image: docker.pkg.github.com/makimo/verifier-mock/verifier-mock:latest
```
