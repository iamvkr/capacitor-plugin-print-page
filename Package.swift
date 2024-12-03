// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorPluginPrintPage",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "CapacitorPluginPrintPage",
            targets: ["PrintpagePlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "PrintpagePlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/PrintpagePlugin"),
        .testTarget(
            name: "PrintpagePluginTests",
            dependencies: ["PrintpagePlugin"],
            path: "ios/Tests/PrintpagePluginTests")
    ]
)