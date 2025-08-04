# Stage 1: Build the Angular application
FROM node:20-alpine AS build

WORKDIR /app

COPY package.json package-lock.json ./
RUN npm install --legacy-peer-deps

COPY . .

# Build Angular application
# We remove the custom output-path and use the Angular default
RUN npm run build -- --configuration=production

# --- DIAGNOSTIC STEP ---
# List the contents of the built Angular directory.
# The default path is 'dist/<project-name>'.
# We will use this to confirm the files exist.
RUN ls -l ./dist/dynamic-website-frontend
# -----------------------

# Stage 2: Serve with Nginx
FROM nginx:alpine

# Copy the custom Nginx configuration file
COPY nginx.conf /etc/nginx/nginx.conf

# Copy the built Angular app from the build stage to Nginx's public directory
# NOTE: The path is now the default build output path
COPY --from=build /app/dist/dynamic-website-frontend/browser/ /usr/share/nginx/html/

EXPOSE 80

# Command to run Nginx with our custom config
CMD ["nginx", "-c", "/etc/nginx/nginx.conf", "-g", "daemon off;"]
