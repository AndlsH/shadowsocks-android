# Shadowsocks for Android [Mod]

[![Build Status](https://travis-ci.org/AndlsH/ssa.svg)](https://travis-ci.org/AndlsH/ssa)

This repository is forked from [shadowsocks/shadowsocks-android](https://github.com/shadowsocks/shadowsocks-android). 

## Note

The released apk files are not signed.

## Modification

### Remove ads
Ads code is located in `./mobile/src/main/scala/com/github/shadowsocks/ProfilesFragment.scala`

```scala
if (item.host == "198.199.101.152") {
  if (adView == null) {
    ...
  } else adView.setVisibility(View.VISIBLE)
} else if (adView != null) adView.setVisibility(View.GONE)
```

### Add profiles


## Feedback

Feel free to file a bug in GitHub Issues!

For questions on shadowsocks, please check the original repository. 

## License

This mod subjects to the GNU GPLv3 License.
