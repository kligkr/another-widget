package com.tommasoberlose.anotherwidget.global

import android.os.Build
import androidx.appcompat.app.AppCompatDelegate.*
import com.chibatching.kotpref.KotprefModel

object Preferences : KotprefModel() {
    override val commitAllPropertiesByDefault: Boolean = true

    var darkThemePreference by intPref(default = MODE_NIGHT_FOLLOW_SYSTEM)

    // Calendar and weather
    var showEvents by booleanPref(key = "PREF_SHOW_EVENTS", default = false)
    var showWeather by booleanPref(key = "PREF_SHOW_WEATHER", default = false)
    var weatherIcon by stringPref(key = "PREF_WEATHER_ICON", default = "")
    var weatherTemp by floatPref(key = "PREF_WEATHER_TEMP", default = 0f)
    var weatherTempUnit by stringPref(key = "PREF_WEATHER_TEMP_UNIT", default = "F")
    var weatherRealTempUnit by stringPref(key = "PREF_WEATHER_REAL_TEMP_UNIT", default = "F")
    var calendarAllDay by booleanPref(key = "PREF_CALENDAR_ALL_DAY", default = true)
    var calendarFilter by stringPref(key = "PREF_CALENDAR_FILTER", default = "")

    var nextEventId by longPref(key = "PREF_NEXT_EVENT_ID", default = -1)
    var nextEventName by stringPref(key = "PREF_NEXT_EVENT_NAME")
    var nextEventStartDate by longPref(key = "PREF_NEXT_EVENT_START_DATE")
    var nextEventAllDay by booleanPref(key = "PREF_NEXT_EVENT_ALL_DAY")
    var nextEventLocation by stringPref(key = "PREF_NEXT_EVENT_LOCATION")
    var nextEventEndDate by longPref(key = "PREF_NEXT_EVENT_END_DATE")
    var nextEventCalendarId by intPref(key = "PREF_NEXT_EVENT_CALENDAR_ID")
    var customLocationLat by stringPref(key = "PREF_CUSTOM_LOCATION_LAT", default = "")
    var customLocationLon by stringPref(key = "PREF_CUSTOM_LOCATION_LON", default = "")
    var customLocationAdd by stringPref(key = "PREF_CUSTOM_LOCATION_ADD", default = "")
    var dateFormat by stringPref(default = "")
    var isDateCapitalize by booleanPref(default = true)
    var weatherRefreshPeriod by intPref(key = "PREF_WEATHER_REFRESH_PERIOD", default = 1)
    var showUntil by intPref(key = "PREF_SHOW_UNTIL", default = 1)
    var calendarAppName by stringPref(key = "PREF_CALENDAR_APP_NAME", default = "")
    var calendarAppPackage by stringPref(key = "PREF_CALENDAR_APP_PACKAGE", default = "")
    var weatherAppName by stringPref(key = "PREF_WEATHER_APP_NAME", default = "")
    var weatherAppPackage by stringPref(key = "PREF_WEATHER_APP_PACKAGE", default = "")
    var weatherProviderApi by stringPref(key = "PREF_WEATHER_PROVIDER_API_KEY", default = "")
    var eventAppName by stringPref(key = "PREF_EVENT_APP_NAME", default = "")
    var eventAppPackage by stringPref(key = "PREF_EVENT_APP_PACKAGE", default = "")
    var openEventDetails by booleanPref(default = true)

    var widgetUpdateFrequency by intPref(default = Constants.WidgetUpdateFrequency.DEFAULT.value)

    var textGlobalColor by stringPref(key = "PREF_TEXT_COLOR", default = "#FFFFFF")
    var textGlobalAlpha by stringPref(default = "FF")

    var textSecondaryColor by stringPref(default = "#FFFFFF")
    var textSecondaryAlpha by stringPref(default = "FF")

    var backgroundCardColor by stringPref(default = "#000000")
    var backgroundCardAlpha by stringPref(default = "00")

    var clockTextColor by stringPref(default = "#FFFFFF")
    var clockTextAlpha by stringPref(default = "FF")
    var showAMPMIndicator by booleanPref(default = true)

    var weatherIconPack by intPref(default = Constants.WeatherIconPack.DEFAULT.value)

    // Global
    var textMainSize by floatPref(key = "PREF_TEXT_MAIN_SIZE", default = 26f)
    var textSecondSize by floatPref(key = "PREF_TEXT_SECOND_SIZE", default = 18f)
    var clockTextSize by floatPref(key = "PREF_TEXT_CLOCK_SIZE", default = 90f)
    var clockBottomMargin by intPref(default = Constants.ClockBottomMargin.MEDIUM.value)
    var showClock by booleanPref(key = "PREF_SHOW_CLOCK", default = false)
    var clockAppName by stringPref(key = "PREF_CLOCK_APP_NAME", default = "")
    var clockAppPackage by stringPref(key = "PREF_CLOCK_APP_PACKAGE", default = "")
    var textShadow by intPref(key = "PREF_TEXT_SHADOW", default = 1)
    var showDiffTime by booleanPref(key = "PREF_SHOW_DIFF_TIME", default = true)
    var showDeclinedEvents by booleanPref(key = "PREF_SHOW_DECLINED_EVENTS", default = false)
    var secondRowInformation by intPref(key = "PREF_SECOND_ROW_INFORMATION", default = 0)
    var customFont by intPref(key = "PREF_CUSTOM_FONT", default = Constants.CUSTOM_FONT_PRODUCT_SANS)
    var customFontFile by stringPref(key = "PREF_CUSTOM_FONT_FILE")
    var showNextEvent by booleanPref(key = "PREF_SHOW_NEXT_EVENT", default = true)

    var showDividers by booleanPref(default = true)

    // Settings
    var showWallpaper by booleanPref(default = true)
    var showBigClockWarning by booleanPref(default = true)
    var showWeatherWarning by booleanPref(default = true)
    var showPreview by booleanPref(default = true)
    var showXiaomiWarning by booleanPref(default = true)

    // Glance
    var showGlance by booleanPref(default = true)
    var enabledGlanceProviderOrder by stringPref(default = "")
    var customNotes by stringPref(default = "")
    var showNextAlarm by booleanPref(default = true)
    var showBatteryCharging by booleanPref(default = false)
    var isBatteryLevelLow by booleanPref(default = false)
    var isCharging by booleanPref(default = false)
    var googleFitSteps by longPref(default = -1)
    var showDailySteps by booleanPref(default = false)

    var showMusic by booleanPref(default = false)
    var mediaInfoFormat by stringPref(default = "")
    var mediaPlayerTitle by stringPref(default = "")
    var mediaPlayerAlbum by stringPref(default = "")
    var mediaPlayerArtist by stringPref(default = "")
    var mediaPlayerPackage by stringPref(default = "")

    // Integrations
    var installedIntegrations by intPref(default = 0)
}
